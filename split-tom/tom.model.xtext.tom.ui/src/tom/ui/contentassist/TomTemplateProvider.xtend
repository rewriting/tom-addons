package tom.ui.contentassist

import com.google.inject.Inject
import java.io.File
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.jface.text.templates.ContextTypeRegistry
import org.eclipse.jface.text.templates.Template
import org.eclipse.jface.text.templates.TemplateContext
import org.eclipse.jface.text.templates.persistence.TemplateStore
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider
import tom.IncludeConstruct
import tom.scoping.Tom3ImportScopeProvider
import tom.services.TomModelGrammarAccess

class TomTemplateProvider extends DefaultTemplateProposalProvider{
	 
	ContextTypeIdHelper helper;

  @Inject
  new(TemplateStore templateStore, 
      ContextTypeRegistry registry,
      ContextTypeIdHelper helper) {
    super(templateStore, registry, helper);
    this.helper=helper;
  }

  @Inject
  TomModelGrammarAccess ga;
  
 	override void createTemplates(TemplateContext templateContext, 
      ContentAssistContext context,ITemplateAcceptor acceptor) {
      	
    super.createTemplates(templateContext, context, acceptor)
    getTemplates(context.currentModel,templateContext)?.forEach[
		acceptor.accept(createProposal(it, templateContext, context, getImage, getRelevance))	
	]
  }
  
  def dispatch getTemplates(IncludeConstruct container,TemplateContext context){
  	val resource = container.eResource
  	val uri = container.importURI
  	val list = new BasicEList<Template>
  	Tom3ImportScopeProvider.getTomPath(resource,uri).forEach[
  		val base = toFileString.substring(0,toFileString.lastIndexOf('/')+1)
  		val file = new File(base)
  		file.list?.filter[new File(base+it)?.isDirectory || endsWith('.tom')]?.forEach[
  			val uriDir = if(uri==null||uri.lastIndexOf('/')==-1){
  				''
  			}else{
  				uri.substring(0,uri.lastIndexOf('/')+1)
  			}
  			if(endsWith('.tom')){
  				list.add(new Template(uriDir+it,it+"-import Tom",helper.getId(ga.URIRule),uriDir+it,true))
  			}else{
  				list.add(new Template(uriDir+it+'/',it+"-import directory",helper.getId(ga.URIRule),uriDir+it+'/',true))
  			}
  		]
  	]
  	return list
  }
  
  def dispatch getTemplates(Object container,TemplateContext context){null}
  def dispatch getTemplates(Void container,TemplateContext context){null}
}