/**
 */
package org.xtext.example.lmrc.entity.entityDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.entity.entityDsl.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Named
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AbstractType)
   * @see org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  AbstractType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.entity.entityDsl.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AbstractType value);

} // Attribute
