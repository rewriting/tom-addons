/*
 * generated by Xtext
 */
package tom.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.FilteringScope
import tom.Context
import tom.LocalVariable

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 *
 */
class TomModelScopeProvider extends AbstractDeclarativeScopeProvider {

	override getScope(EObject context, EReference reference) {
		new FilteringScope(super.getScope(context,reference),[
			!(EObjectOrProxy instanceof LocalVariable) || context.sameContext(EObjectOrProxy.context)
		])
	}
	
	def protected Context getContext(EObject variable){
		if(variable.eContainer instanceof Context){
			return variable.eContainer as Context
		}else{
			return variable.eContainer.context
		}
	}
	
	def protected boolean sameContext(EObject context, Context parent){
		context.equals(parent) || context.eContainer?.sameContext(parent)
	}
}