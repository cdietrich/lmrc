/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.entity.entityDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.lmrc.entity.entityDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityDslFactoryImpl extends EFactoryImpl implements EntityDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EntityDslFactory init()
  {
    try
    {
      EntityDslFactory theEntityDslFactory = (EntityDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/lmrc/entity/EntityDsl"); 
      if (theEntityDslFactory != null)
      {
        return theEntityDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EntityDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityDslFactoryImpl()
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
      case EntityDslPackage.MODULE: return createModule();
      case EntityDslPackage.ENTITY: return createEntity();
      case EntityDslPackage.ATTRIBUTE: return createAttribute();
      case EntityDslPackage.NAMED: return createNamed();
      case EntityDslPackage.ABSTRACT_TYPE: return createAbstractType();
      case EntityDslPackage.BOOLEAN_TYPE: return createBooleanType();
      case EntityDslPackage.INT_TYPE: return createIntType();
      case EntityDslPackage.STRING_TYPE: return createStringType();
      case EntityDslPackage.ENTITY_REFERENCE: return createEntityReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Named createNamed()
  {
    NamedImpl named = new NamedImpl();
    return named;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractType createAbstractType()
  {
    AbstractTypeImpl abstractType = new AbstractTypeImpl();
    return abstractType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityReference createEntityReference()
  {
    EntityReferenceImpl entityReference = new EntityReferenceImpl();
    return entityReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityDslPackage getEntityDslPackage()
  {
    return (EntityDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EntityDslPackage getPackage()
  {
    return EntityDslPackage.eINSTANCE;
  }

} //EntityDslFactoryImpl
