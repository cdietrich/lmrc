/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.entity.entityDsl;

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
 * @see org.xtext.example.lmrc.entity.entityDsl.EntityDslFactory
 * @model kind="package"
 * @generated
 */
public interface EntityDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "entityDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/lmrc/entity/EntityDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "entityDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EntityDslPackage eINSTANCE = org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.NamedImpl <em>Named</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.NamedImpl
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getNamed()
   * @generated
   */
  int NAMED = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED__NAME = 0;

  /**
   * The number of structural features of the '<em>Named</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.ModuleImpl
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getModule()
   * @generated
   */
  int MODULE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = NAMED__NAME;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ENTITIES = NAMED_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityImpl
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = NAMED__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = NAMED_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.AttributeImpl
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = NAMED__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = NAMED_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.AbstractTypeImpl
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getAbstractType()
   * @generated
   */
  int ABSTRACT_TYPE = 4;

  /**
   * The number of structural features of the '<em>Abstract Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.BooleanTypeImpl
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 5;

  /**
   * The number of structural features of the '<em>Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.IntTypeImpl
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 6;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.StringTypeImpl
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 7;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityReferenceImpl
   * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getEntityReference()
   * @generated
   */
  int ENTITY_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE__REF = ABSTRACT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.entity.entityDsl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.lmrc.entity.entityDsl.Module#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.Module#getEntities()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Entities();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.entity.entityDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.lmrc.entity.entityDsl.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.entity.entityDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.lmrc.entity.entityDsl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.entity.entityDsl.Named <em>Named</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.Named
   * @generated
   */
  EClass getNamed();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.lmrc.entity.entityDsl.Named#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.Named#getName()
   * @see #getNamed()
   * @generated
   */
  EAttribute getNamed_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.entity.entityDsl.AbstractType <em>Abstract Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Type</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.AbstractType
   * @generated
   */
  EClass getAbstractType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.entity.entityDsl.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Type</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.BooleanType
   * @generated
   */
  EClass getBooleanType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.entity.entityDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.entity.entityDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.entity.entityDsl.EntityReference <em>Entity Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Reference</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.EntityReference
   * @generated
   */
  EClass getEntityReference();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.lmrc.entity.entityDsl.EntityReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.xtext.example.lmrc.entity.entityDsl.EntityReference#getRef()
   * @see #getEntityReference()
   * @generated
   */
  EReference getEntityReference_Ref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EntityDslFactory getEntityDslFactory();

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
     * The meta object literal for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.ModuleImpl
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__ENTITIES = eINSTANCE.getModule_Entities();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityImpl
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.AttributeImpl
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.NamedImpl <em>Named</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.NamedImpl
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getNamed()
     * @generated
     */
    EClass NAMED = eINSTANCE.getNamed();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.AbstractTypeImpl
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getAbstractType()
     * @generated
     */
    EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.BooleanTypeImpl
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getBooleanType()
     * @generated
     */
    EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.IntTypeImpl
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.StringTypeImpl
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.entity.entityDsl.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityReferenceImpl
     * @see org.xtext.example.lmrc.entity.entityDsl.impl.EntityDslPackageImpl#getEntityReference()
     * @generated
     */
    EClass ENTITY_REFERENCE = eINSTANCE.getEntityReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_REFERENCE__REF = eINSTANCE.getEntityReference_Ref();

  }

} //EntityDslPackage
