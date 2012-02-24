/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.db2entity.db2EntityDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.lmrc.db2entity.db2EntityDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Db2EntityDslFactoryImpl extends EFactoryImpl implements Db2EntityDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Db2EntityDslFactory init()
  {
    try
    {
      Db2EntityDslFactory theDb2EntityDslFactory = (Db2EntityDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/lmrc/db2entity/Db2EntityDsl"); 
      if (theDb2EntityDslFactory != null)
      {
        return theDb2EntityDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Db2EntityDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Db2EntityDslFactoryImpl()
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
      case Db2EntityDslPackage.ENTITY_COLUMN_MAPPER: return createEntityColumnMapper();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityColumnMapper createEntityColumnMapper()
  {
    EntityColumnMapperImpl entityColumnMapper = new EntityColumnMapperImpl();
    return entityColumnMapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Db2EntityDslPackage getDb2EntityDslPackage()
  {
    return (Db2EntityDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Db2EntityDslPackage getPackage()
  {
    return Db2EntityDslPackage.eINSTANCE;
  }

} //Db2EntityDslFactoryImpl
