package tom.generator

import tom.Tom

interface TomGenerator {
	
	def String runCompile(Tom tom)
	def String runCompileInterface(Tom tom)
	def String getCode()
}