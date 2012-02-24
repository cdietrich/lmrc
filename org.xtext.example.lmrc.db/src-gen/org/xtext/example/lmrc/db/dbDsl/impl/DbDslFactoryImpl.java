/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.db.dbDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.lmrc.db.dbDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbDslFactoryImpl extends EFactoryImpl implements DbDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DbDslFactory init()
  {
    try
    {
      DbDslFactory theDbDslFactory = (DbDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/lmrc/db/DbDsl"); 
      if (theDbDslFactory != null)
      {
        return theDbDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DbDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DbDslPackage.ROOT: return createRoot();
      case DbDslPackage.DATABASE: return createDatabase();
      case DbDslPackage.TABLE: return createTable();
      case DbDslPackage.COLUMN: return createColumn();
      case DbDslPackage.ABSTRACT_COLUMN_MAPPER: return createAbstractColumnMapper();
      case DbDslPackage.ABSTRACT_DATA_TYPE: return createAbstractDataType();
      case DbDslPackage.CHAR_TYPE: return createCharType();
      case DbDslPackage.NUMBER_TYPE: return createNumberType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Database createDatabase()
  {
    DatabaseImpl database = new DatabaseImpl();
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractColumnMapper createAbstractColumnMapper()
  {
    AbstractColumnMapperImpl abstractColumnMapper = new AbstractColumnMapperImpl();
    return abstractColumnMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDataType createAbstractDataType()
  {
    AbstractDataTypeImpl abstractDataType = new AbstractDataTypeImpl();
    return abstractDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharType createCharType()
  {
    CharTypeImpl charType = new CharTypeImpl();
    return charType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberType createNumberType()
  {
    NumberTypeImpl numberType = new NumberTypeImpl();
    return numberType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbDslPackage getDbDslPackage()
  {
    return (DbDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DbDslPackage getPackage()
  {
    return DbDslPackage.eINSTANCE;
  }

} //DbDslFactoryImpl
