package org.xtext.example.lmrc.entityexpr.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.lmrc.entityexpr.entityWithExprDsl.Attribute;
import org.xtext.example.lmrc.entityexpr.entityWithExprDsl.Entity;
import org.xtext.example.lmrc.entityexpr.entityWithExprDsl.Operation;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class EntityWithExprDslJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final Entity entity, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(entity);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            String _documentation = EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(entity);
            EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            EList<Attribute> _attributes = entity.getAttributes();
            for (final Attribute attr : _attributes) {
              {
                EList<JvmMember> _members = it.getMembers();
                String _name = attr.getName();
                JvmTypeReference _type = attr.getType();
                JvmField _field = EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.toField(attr, _name, _type);
                CollectionExtensions.<JvmField>operator_add(_members, _field);
                EList<JvmMember> _members_1 = it.getMembers();
                String _name_1 = attr.getName();
                JvmTypeReference _type_1 = attr.getType();
                JvmOperation _getter = EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.toGetter(attr, _name_1, _type_1);
                CollectionExtensions.<JvmOperation>operator_add(_members_1, _getter);
                EList<JvmMember> _members_2 = it.getMembers();
                String _name_2 = attr.getName();
                JvmTypeReference _type_2 = attr.getType();
                JvmOperation _setter = EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.toSetter(attr, _name_2, _type_2);
                CollectionExtensions.<JvmOperation>operator_add(_members_2, _setter);
              }
            }
            EList<Operation> _operations = entity.getOperations();
            for (final Operation op : _operations) {
              EList<JvmMember> _members_3 = it.getMembers();
              String _name_3 = op.getName();
              JvmTypeReference _type_3 = op.getType();
              final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    {
                      String _documentation = EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(op);
                      EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                      EList<JvmFormalParameter> _parameters = op.getParameters();
                      for (final JvmFormalParameter p : _parameters) {
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        String _name = p.getName();
                        JvmTypeReference _parameterType = p.getParameterType();
                        JvmFormalParameter _parameter = EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
                        CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
                      }
                      XExpression _body = op.getBody();
                      EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                    }
                  }
                };
              JvmOperation _method = EntityWithExprDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(op, _name_3, _type_3, _function);
              CollectionExtensions.<JvmOperation>operator_add(_members_3, _method);
            }
          }
        }
      };
    JvmGenericType _class = this._jvmTypesBuilder.toClass(entity, _fullyQualifiedName, _function);
    acceptor.accept(_class);
  }
  
  public void infer(final EObject entity, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    if (entity instanceof Entity) {
      _infer((Entity)entity, acceptor, isPrelinkingPhase);
    } else if (entity != null) {
      _infer(entity, acceptor, isPrelinkingPhase);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(entity, acceptor, isPrelinkingPhase).toString());
    }
  }
}
