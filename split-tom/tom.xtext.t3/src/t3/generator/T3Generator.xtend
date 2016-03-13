package t3.generator

import java.util.MissingResourceException
import org.eclipse.emf.common.CommonPlugin
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess
import tom.Tom
import tom.generator.TomGenerator
import tom.generator.TomModelGenerator
import tom.scoping.Tom3ImportScopeProvider

class T3Generator extends TomModelGenerator{
	
	val extens = "t"
	val tomCompiler = new T3Compiler
	val DEFAULT = new t3.generator.java.TomGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		try{
			val tomGenerator = try{	
				Tom3ImportScopeProvider.getProperties(resource).getString("code").generator
				}catch(MissingResourceException e){
					DEFAULT
				}
			val prog = resource.contents.head as Tom
			if(prog !=null){
				//generate .t file
				fsa.generateFile(resource.fileName("Tom."+extens),tomGenerator.runCompile(prog))
				
				//generate interface for callback
				fsa.generateFile(prog.namespace.replace('.','/')+"/"+resource.fileName("Tomi.java"),tomGenerator.runCompileInterface(prog))
				
				//generate host files
				tomCompiler.compile(
					Tom3ImportScopeProvider.getProject(resource)+'/',
					CommonPlugin::resolve((fsa as AbstractFileSystemAccess).getURI("")).toFileString,
					resource.fileName("Tom."+extens),
					Tom3ImportScopeProvider.getProperties(resource),
					tomGenerator.code
				)
			}
		}catch(Exception e){
			tomCompiler.out.println(e.message);
			e.printStackTrace
		}	
	}
	
	def TomGenerator getGenerator(String code){
		switch(code){
			case "j" :return new t3.generator.java.TomGenerator
			default : throw new RuntimeException("unimplemented generator")
		}
	}
}