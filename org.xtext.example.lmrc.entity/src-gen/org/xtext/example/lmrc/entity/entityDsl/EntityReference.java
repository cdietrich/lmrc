/**
 */
package org.xtext.example.lmrc.entity.entityDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.entity.entityDsl.EntityReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage#getEntityReference()
 * @model
 * @generated
 */
public interface EntityReference extends AbstractType
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Entity)
   * @see org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage#getEntityReference_Ref()
   * @model
   * @generated
   */
  Entity getRef();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.entity.entityDsl.EntityReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Entity value);

} // EntityReference
