package org.xtext.example.lmrc.entityexpr.jvmmodel
 
import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.example.lmrc.entityexpr.entityWithExprDsl.Entity
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class EntityWithExprDslJvmModelInferrer extends AbstractModelInferrer {
	
	@Inject extension IQualifiedNameProvider

	@Inject extension JvmTypesBuilder

   	def dispatch void infer(Entity entity, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
   		acceptor.accept(
			entity.toClass( entity.fullyQualifiedName ) [
				documentation = entity.documentation
					
				for ( attr : entity.attributes ) {
							members += attr.toField(attr.name, attr.type)
							members += attr.toGetter(attr.name, attr.type)
							members += attr.toSetter(attr.name, attr.type)
				}
				
				for ( op : entity.operations ) {
					members += op.toMethod(op.name, op.type) [
						documentation = op.documentation
						for (p : op.parameters) {
							parameters += p.toParameter(p.name, p.parameterType)
						}
						body = op.body
					]
				}
					
					
				
				
			]
		)
   	}
}
