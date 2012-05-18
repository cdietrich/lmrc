/**
 */
package org.xtext.example.lmrc.db2entity.db2EntityDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslPackage
 * @generated
 */
public interface Db2EntityDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Db2EntityDslFactory eINSTANCE = org.xtext.example.lmrc.db2entity.db2EntityDsl.impl.Db2EntityDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Entity Column Mapper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Column Mapper</em>'.
   * @generated
   */
  EntityColumnMapper createEntityColumnMapper();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Db2EntityDslPackage getDb2EntityDslPackage();

} //Db2EntityDslFactory
