/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.db2entity.db2EntityDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.lmrc.db.dbDsl.DbDslPackage;

import org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslFactory;
import org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslPackage;
import org.xtext.example.lmrc.db2entity.db2EntityDsl.EntityColumnMapper;

import org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Db2EntityDslPackageImpl extends EPackageImpl implements Db2EntityDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityColumnMapperEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Db2EntityDslPackageImpl()
  {
    super(eNS_URI, Db2EntityDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Db2EntityDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Db2EntityDslPackage init()
  {
    if (isInited) return (Db2EntityDslPackage)EPackage.Registry.INSTANCE.getEPackage(Db2EntityDslPackage.eNS_URI);

    // Obtain or create and register package
    Db2EntityDslPackageImpl theDb2EntityDslPackage = (Db2EntityDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Db2EntityDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Db2EntityDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    DbDslPackage.eINSTANCE.eClass();
    EntityDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDb2EntityDslPackage.createPackageContents();

    // Initialize created meta-data
    theDb2EntityDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDb2EntityDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Db2EntityDslPackage.eNS_URI, theDb2EntityDslPackage);
    return theDb2EntityDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityColumnMapper()
  {
    return entityColumnMapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityColumnMapper_Entity()
  {
    return (EReference)entityColumnMapperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Db2EntityDslFactory getDb2EntityDslFactory()
  {
    return (Db2EntityDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    entityColumnMapperEClass = createEClass(ENTITY_COLUMN_MAPPER);
    createEReference(entityColumnMapperEClass, ENTITY_COLUMN_MAPPER__ENTITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    DbDslPackage theDbDslPackage = (DbDslPackage)EPackage.Registry.INSTANCE.getEPackage(DbDslPackage.eNS_URI);
    EntityDslPackage theEntityDslPackage = (EntityDslPackage)EPackage.Registry.INSTANCE.getEPackage(EntityDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    entityColumnMapperEClass.getESuperTypes().add(theDbDslPackage.getAbstractColumnMapper());

    // Initialize classes and features; add operations and parameters
    initEClass(entityColumnMapperEClass, EntityColumnMapper.class, "EntityColumnMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityColumnMapper_Entity(), theEntityDslPackage.getAttribute(), null, "entity", null, 0, 1, EntityColumnMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Db2EntityDslPackageImpl
