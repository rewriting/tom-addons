package t3.generator.java

import tom.AntiRulePattern
import tom.Callback
import tom.CallbackDefinition
import tom.ConditionAnd
import tom.ConditionOp
import tom.ConditionOr
import tom.ConditionP
import tom.ConditionRule
import tom.Function
import tom.GomConstruct
import tom.GraphRule
import tom.HookModuleDefinition
import tom.HookOperatorDefinition
import tom.HookTypeDefinition
import tom.Hook_AU
import tom.Hook_Graphrules
import tom.Hook_Rules
import tom.HostHookOperation
import tom.NamedRulePattern
import tom.OperatorDefinition
import tom.PlainRulePatternOperation
import tom.Rule
import tom.TermGraph
import tom.TermGraphFunc
import tom.TermGraphVariable
import tom.TermOperation
import tom.Tom
import tom.TypeDefinition
import tom.generator.java.TomGeneratorImpl
import tom.ImportConstruct

class TomGenerator extends TomGeneratorImpl{
	
	override runCompile(Tom tom) {
		tom.compile
	}
	
	override runCompileInterface(Tom tom) {
		tom?.compileInterface
	}
	
	
	///////Interface//////////////////////////////////////////////////////////////////////////////////////////////
	def String compileInterface(Tom t)'''
«IF t.namespace != null»package «t.namespace»;«ENDIF»

public interface «t.eResource.URI.lastSegment.replace(".t3","Tomi")»{
	«FOR c : t.callback»
	
	«IF c.type !=null»«c.type.fullCompile»«ELSE»void«ENDIF» «c.name»(«c.args.fullCompile»);
	«ENDFOR»
}
	'''
	def Iterable<CallbackDefinition> callback(Tom t){t.blocs.filter(Callback).map[operations].flatten}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////
/////Tom///////////////////////////////////////////////////////////////////////////////////////////////////
	
	def dispatch String compile(Callback c)''''''
	def dispatch String compile(CallbackDefinition cd)''''''
	
	def dispatch String compile(Tom t)'''
«IF t.namespace != null»package «t.namespace»;«ENDIF»
«FOR i : t.blocs.filter(ImportConstruct)»
import «i.type.fullCompile»;
«ENDFOR»

@SuppressWarnings("all")
public class «t.eResource.URI.lastSegment.replace(".t3","Tom")»{
«IF !t.callback.empty»	
	private «t.eResource.fileName("Tomi")» callback;
	
	public «t.eResource.URI.lastSegment.replace(".t3","Tom")»(«t.eResource.fileName('Tomi')» callback){this.callback=callback;}
	public void setCallback(«t.eResource.fileName('Tomi')» callback){this.callback=callback;}
«ENDIF»
	«t.blocs.map[compile].join("\n")»

}
	'''
/////////////////////////////////////////////////////////////////////////////////////////////////////
///Function//////////////////////////////////////////////////////////////////////////////////////////////////
	override dispatch String fullCompile(TermOperation term){
		if(term.op instanceof CallbackDefinition){
			'''callback.«term.op.name»(«term.terms.map[fullCompile].join(", ")»)'''
		}else{
			'''`«term.op.name»(«term.terms.map[compile].join(", ")»)'''
		}
	}


	def dispatch String compile(Function fun)'''
public «IF fun.type !=null»«fun.type.fullCompile»«ELSE»void«ENDIF» «fun.name»(«fun.args.fullCompile») {
	«fun.statements.map[fullCompile].join("\n")»
}
	'''
	
/////////////////////////////////////////////////////////////////////////////////////////////////////
//Gom //////////////////////////////////////////////////////////////////////////////////////////
	def dispatch String compile(GomConstruct gom)'''
%gom«IF gom.option != null»(--«gom.option»)«ENDIF»{
	module «gom.name» «IF !gom.imports.empty»imports «FOR type : gom.imports»«type.name» «ENDFOR»«ENDIF»
	abstract syntax 
	«gom.definitions.map[compile].join("\n")»
}
	'''
	def dispatch String compile(TypeDefinition define)'''
«define.name»=
	«define.opDefinition.map[compile].join("\n|")»
'''
	def dispatch String compile(OperatorDefinition op)'''«op.name»(«IF op.args!=null»«op.args.compile»«ENDIF»)'''
	
	
	def dispatch String compile(HookModuleDefinition define)'''module «define.hookType.name» : «define.hookOperation.compile»'''
	def dispatch String compile(HookTypeDefinition define)'''sort «define.hookType.name» : «define.hookOperation.compile»'''
	def dispatch String compile(HookOperatorDefinition define)'''«define.hookType.name» : «define.hookOperation.compile»'''
	def dispatch String compile(HostHookOperation hho)'''«hho.name»(«hho.args.compile»){«hho.statements.map[fullCompile].join("\n")»}'''
	def dispatch String compile(Hook_AU hau)'''«hau.name»(){«hau.term.fullCompile»}'''
	
	def dispatch String compile(Hook_Rules hook)'''rules(){ «hook.rules.map[compile].join(" ")»}'''
	def dispatch String compile(Hook_Graphrules hook)'''graphrules(«hook.name.compile», «hook.mode.compile»){ «hook.graphRules.map[compile].join(" ")»}'''

	def dispatch String compile(Rule rule)'''«rule.rulePattern.compile»->«rule.term.compile»«IF rule.cond != null» if «rule.cond.compile»«»«ENDIF»'''
	def dispatch String compile(NamedRulePattern rp)'''«rp.name»@«rp.plainRulePattern.compile»'''
	def dispatch String compile(AntiRulePattern ap)'''!«ap.pattern.compile»''' 
	def dispatch String compile(PlainRulePatternOperation pl)'''«pl.heads.compile»(«pl.rules.map[compile].join(",")»)'''
	
	def dispatch String compile(GraphRule	 gr)'''«gr.termcond.compile»->«gr.termGraph.compile»«IF gr.cond != null» if «gr.cond.compile»«»«ENDIF»'''
	def dispatch String compile(TermGraph	 termG)'''«IF termG.name !=null»«termG.name»:«ENDIF»«termG.termGraph.compile»''' 	
	def dispatch String compile(TermGraphVariable termV)'''«IF termV.label»&«ENDIF»«termV.name»'''  
	def dispatch String compile(TermGraphFunc termF)'''«termF.head.compile»(«termF.terms.map[compile].join(",")»)''' 
	def dispatch String compile(ConditionOr c)'''«c.left.compile»||«c.right.compile»''' 
	def dispatch String compile(ConditionAnd c)'''«c.left.compile»&&«c.right.compile»'''
	def dispatch String compile(ConditionP cp)'''(«cp.condition.compile»)''' 
	def dispatch String compile(ConditionRule cr)'''«cr.rule.compile»<<«cr.term.compile»'''
	def dispatch String compile(ConditionOp co)'''«co.left.compile» «co.operator.compile» «co.right.compile»'''
	
/////////////////////////////////////////////////////////////////////////////////////////////////////	
//operator //////////////////////////////////////////////////////////////////////////////////////////	
	
//	def dispatch String compile(KeyWord key)'''«key.name.compile»(«key.args.compile»){}'''
	
//	def dispatch  compile(Operator op)'''%op «op.type.compile» «op.name.compile»(«op.args.map[compile].join(",")»){«op.fsym.compile»«op.keys.map[compile].join("")»}'''
//	
//	def dispatch String compile(OperatorArray opa)'''%oparray «opa.type.compile» «opa.name.compile»(«opa.type2»*){«opa.fsym.compile»«opa.akey.map[compile].join("")»}'''
//	def dispatch String compile(OperatorList opl)'''%oplist «opl.type.compile» «opl.name.compile»(«opl.type2.compile»*){ «opl.fsym.compile»«opl.lkey.map[compile].join("")»}'''

/////////////////////////////////////////////////////////////////////////////////////////////////////
}