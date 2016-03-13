package tom.scoping;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

import tom.Block;
import tom.IncludeConstruct;
import tom.Tom;

public class Tom3ImportScopeProvider extends ImportUriGlobalScopeProvider {
	
	@Override 
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		LinkedHashSet<URI> list = new LinkedHashSet<URI>();
		for(Block b : ((Tom)resource.getContents().get(0)).getBlocs()){
			if(b instanceof IncludeConstruct){
				list.addAll(getTomPath(resource, ((IncludeConstruct)b).getImportURI()));
			}
		}
		return list;	
	}
	
	public static Collection<URI> getTomPath(Resource resource, String uri){
		LinkedList<URI> l= new LinkedList<URI>();
		try{
			for(String i : getProperties(resource).getString("imports").split(" ")){
				l.add(URI.createFileURI(getProject(resource)+"/"+i+"/"+uri+".tom"));
			}
		}catch(Exception e){
		}
		l.add(URI.createFileURI(getPwd(resource)+"/"+uri+".tom"));
		return l;
	}
	
	public static String getPwd(Resource resource){
		String base = resource.getURI().toString();
		return CommonPlugin.resolve(URI.createURI(base.substring(0,base.lastIndexOf("/")))).toFileString();		
	}
	
	public static String getProject(Resource resource){
		String base = 	resource.getURI().toPlatformString(true);
		return CommonPlugin.resolve(URI.createURI("platform:/resource"+base.substring(0,base.indexOf("/",1)))).toFileString();
			
	}
	
	public static ResourceBundle getProperties(Resource resource) {
		try(FileInputStream stream = new FileInputStream(getProject(resource)+"/tom.properties")){
			ResourceBundle.clearCache();
			ResourceBundle bundle =  new PropertyResourceBundle(stream);
			return bundle;
		}catch(Exception e){
			return null;
		}
	}
}