/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.db.dbDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.xtext.example.lmrc.db.dbDsl.DbDslFactory
 * @model kind="package"
 * @generated
 */
public interface DbDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dbDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/lmrc/db/DbDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dbDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DbDslPackage eINSTANCE = org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.db.dbDsl.impl.RootImpl
   * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.DatabaseImpl <em>Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.db.dbDsl.impl.DatabaseImpl
   * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getDatabase()
   * @generated
   */
  int DATABASE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__NAME = ROOT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__TABLES = ROOT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_FEATURE_COUNT = ROOT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.db.dbDsl.impl.TableImpl
   * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getTable()
   * @generated
   */
  int TABLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLUMNS = 1;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.db.dbDsl.impl.ColumnImpl
   * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 1;

  /**
   * The feature id for the '<em><b>Mapper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__MAPPER = 2;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.AbstractColumnMapperImpl <em>Abstract Column Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.db.dbDsl.impl.AbstractColumnMapperImpl
   * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getAbstractColumnMapper()
   * @generated
   */
  int ABSTRACT_COLUMN_MAPPER = 4;

  /**
   * The number of structural features of the '<em>Abstract Column Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COLUMN_MAPPER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.AbstractDataTypeImpl <em>Abstract Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.db.dbDsl.impl.AbstractDataTypeImpl
   * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getAbstractDataType()
   * @generated
   */
  int ABSTRACT_DATA_TYPE = 5;

  /**
   * The number of structural features of the '<em>Abstract Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.CharTypeImpl <em>Char Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.db.dbDsl.impl.CharTypeImpl
   * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getCharType()
   * @generated
   */
  int CHAR_TYPE = 6;

  /**
   * The number of structural features of the '<em>Char Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_TYPE_FEATURE_COUNT = ABSTRACT_DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.NumberTypeImpl <em>Number Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.db.dbDsl.impl.NumberTypeImpl
   * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getNumberType()
   * @generated
   */
  int NUMBER_TYPE = 7;

  /**
   * The number of structural features of the '<em>Number Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_TYPE_FEATURE_COUNT = ABSTRACT_DATA_TYPE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.db.dbDsl.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.db.dbDsl.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Database
   * @generated
   */
  EClass getDatabase();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.lmrc.db.dbDsl.Database#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Database#getName()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.lmrc.db.dbDsl.Database#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Database#getTables()
   * @see #getDatabase()
   * @generated
   */
  EReference getDatabase_Tables();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.db.dbDsl.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.lmrc.db.dbDsl.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.lmrc.db.dbDsl.Table#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Table#getColumns()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Columns();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.db.dbDsl.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.lmrc.db.dbDsl.Column#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Column#getType()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.lmrc.db.dbDsl.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.lmrc.db.dbDsl.Column#getMapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapper</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.Column#getMapper()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Mapper();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.db.dbDsl.AbstractColumnMapper <em>Abstract Column Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Column Mapper</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.AbstractColumnMapper
   * @generated
   */
  EClass getAbstractColumnMapper();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.db.dbDsl.AbstractDataType <em>Abstract Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Data Type</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.AbstractDataType
   * @generated
   */
  EClass getAbstractDataType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.db.dbDsl.CharType <em>Char Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Type</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.CharType
   * @generated
   */
  EClass getCharType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.db.dbDsl.NumberType <em>Number Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Type</em>'.
   * @see org.xtext.example.lmrc.db.dbDsl.NumberType
   * @generated
   */
  EClass getNumberType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DbDslFactory getDbDslFactory();

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
     * The meta object literal for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.db.dbDsl.impl.RootImpl
     * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.db.dbDsl.impl.DatabaseImpl
     * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getDatabase()
     * @generated
     */
    EClass DATABASE = eINSTANCE.getDatabase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE__TABLES = eINSTANCE.getDatabase_Tables();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.db.dbDsl.impl.TableImpl
     * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.db.dbDsl.impl.ColumnImpl
     * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN__TYPE = eINSTANCE.getColumn_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '<em><b>Mapper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN__MAPPER = eINSTANCE.getColumn_Mapper();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.AbstractColumnMapperImpl <em>Abstract Column Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.db.dbDsl.impl.AbstractColumnMapperImpl
     * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getAbstractColumnMapper()
     * @generated
     */
    EClass ABSTRACT_COLUMN_MAPPER = eINSTANCE.getAbstractColumnMapper();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.AbstractDataTypeImpl <em>Abstract Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.db.dbDsl.impl.AbstractDataTypeImpl
     * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getAbstractDataType()
     * @generated
     */
    EClass ABSTRACT_DATA_TYPE = eINSTANCE.getAbstractDataType();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.CharTypeImpl <em>Char Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.db.dbDsl.impl.CharTypeImpl
     * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getCharType()
     * @generated
     */
    EClass CHAR_TYPE = eINSTANCE.getCharType();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.db.dbDsl.impl.NumberTypeImpl <em>Number Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.db.dbDsl.impl.NumberTypeImpl
     * @see org.xtext.example.lmrc.db.dbDsl.impl.DbDslPackageImpl#getNumberType()
     * @generated
     */
    EClass NUMBER_TYPE = eINSTANCE.getNumberType();

  }

} //DbDslPackage
