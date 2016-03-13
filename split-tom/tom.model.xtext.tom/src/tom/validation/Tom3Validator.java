package tom.validation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;

import tom.IncludeConstruct;
import tom.TomPackage;
import tom.Type;
import tom.scoping.Tom3ImportScopeProvider;

public class Tom3Validator extends AbstractDeclarativeValidator {

	@Override 
	protected List<EPackage> getEPackages() {
	    ArrayList<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.tom3.tom/tom"));
		return result;
	}
	
	/**
	 * check the existence of file include
	 * @param include
	 */
	@Check
	public void chekImport(IncludeConstruct include){
		if((include.getExt() != null && !include.getExt().equals("tom"))){
			error("Expected tom",TomPackage.Literals.INCLUDE_CONSTRUCT__EXT,"Unknown extension");	
		}
		boolean exist = false;
		java.util.Iterator<URI> iter = Tom3ImportScopeProvider.getTomPath(include.eResource(),include.getImportURI()).iterator(); 
		while(!exist && iter.hasNext()){
			exist=new File(iter.next().toFileString()).exists();
		}
		if( !exist){
			error("This file does not exist",TomPackage.Literals.INCLUDE_CONSTRUCT__IMPORT_URI,"Unknown file");	
		}
	}
	
	@Check
	public void checkStrategy(Type type){
		if(inconsistent(type.getExtend(),type)){
			error("The hierarchy of this type is inconsistent",TomPackage.Literals.TYPE__EXTEND,"recursive extends");
		}
	}
	
	protected boolean inconsistent(Type extend, Type type){
		return extend == type || extend.getExtend() != null && inconsistent(extend.getExtend(),type);
	}
}