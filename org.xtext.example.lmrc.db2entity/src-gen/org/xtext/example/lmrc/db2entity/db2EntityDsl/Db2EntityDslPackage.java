/**
 */
package org.xtext.example.lmrc.db2entity.db2EntityDsl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.xtext.example.lmrc.db.dbDsl.DbDslPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslFactory
 * @model kind="package"
 * @generated
 */
public interface Db2EntityDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "db2EntityDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/lmrc/db2entity/Db2EntityDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "db2EntityDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Db2EntityDslPackage eINSTANCE = org.xtext.example.lmrc.db2entity.db2EntityDsl.impl.Db2EntityDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.db2entity.db2EntityDsl.impl.EntityColumnMapperImpl <em>Entity Column Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.impl.EntityColumnMapperImpl
   * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.impl.Db2EntityDslPackageImpl#getEntityColumnMapper()
   * @generated
   */
  int ENTITY_COLUMN_MAPPER = 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_COLUMN_MAPPER__ENTITY = DbDslPackage.ABSTRACT_COLUMN_MAPPER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity Column Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_COLUMN_MAPPER_FEATURE_COUNT = DbDslPackage.ABSTRACT_COLUMN_MAPPER_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.db2entity.db2EntityDsl.EntityColumnMapper <em>Entity Column Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Column Mapper</em>'.
   * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.EntityColumnMapper
   * @generated
   */
  EClass getEntityColumnMapper();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.lmrc.db2entity.db2EntityDsl.EntityColumnMapper#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.EntityColumnMapper#getEntity()
   * @see #getEntityColumnMapper()
   * @generated
   */
  EReference getEntityColumnMapper_Entity();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Db2EntityDslFactory getDb2EntityDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.db2entity.db2EntityDsl.impl.EntityColumnMapperImpl <em>Entity Column Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.impl.EntityColumnMapperImpl
     * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.impl.Db2EntityDslPackageImpl#getEntityColumnMapper()
     * @generated
     */
    EClass ENTITY_COLUMN_MAPPER = eINSTANCE.getEntityColumnMapper();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_COLUMN_MAPPER__ENTITY = eINSTANCE.getEntityColumnMapper_Entity();

  }

} //Db2EntityDslPackage
