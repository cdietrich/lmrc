/**
 */
package org.xtext.example.lmrc.entity.entityDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage
 * @generated
 */
public interface EntityDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EntityDslFactory eINSTANCE = org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Named</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named</em>'.
   * @generated
   */
  Named createNamed();

  /**
   * Returns a new object of class '<em>Abstract Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Type</em>'.
   * @generated
   */
  AbstractType createAbstractType();

  /**
   * Returns a new object of class '<em>Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Type</em>'.
   * @generated
   */
  BooleanType createBooleanType();

  /**
   * Returns a new object of class '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Type</em>'.
   * @generated
   */
  IntType createIntType();

  /**
   * Returns a new object of class '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Type</em>'.
   * @generated
   */
  StringType createStringType();

  /**
   * Returns a new object of class '<em>Entity Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Reference</em>'.
   * @generated
   */
  EntityReference createEntityReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EntityDslPackage getEntityDslPackage();

} //EntityDslFactory
