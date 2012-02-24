/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.uispec.uispecDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage;

import org.xtext.example.lmrc.uispec.uispecDsl.CheckBoxWidget;
import org.xtext.example.lmrc.uispec.uispecDsl.ComboWidget;
import org.xtext.example.lmrc.uispec.uispecDsl.EntityReference;
import org.xtext.example.lmrc.uispec.uispecDsl.Field;
import org.xtext.example.lmrc.uispec.uispecDsl.Form;
import org.xtext.example.lmrc.uispec.uispecDsl.TextFieldWidget;
import org.xtext.example.lmrc.uispec.uispecDsl.UispecDslFactory;
import org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage;
import org.xtext.example.lmrc.uispec.uispecDsl.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UispecDslPackageImpl extends EPackageImpl implements UispecDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textFieldWidgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkBoxWidgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comboWidgetEClass = null;

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
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UispecDslPackageImpl()
  {
    super(eNS_URI, UispecDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link UispecDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UispecDslPackage init()
  {
    if (isInited) return (UispecDslPackage)EPackage.Registry.INSTANCE.getEPackage(UispecDslPackage.eNS_URI);

    // Obtain or create and register package
    UispecDslPackageImpl theUispecDslPackage = (UispecDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UispecDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UispecDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EntityDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theUispecDslPackage.createPackageContents();

    // Initialize created meta-data
    theUispecDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUispecDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UispecDslPackage.eNS_URI, theUispecDslPackage);
    return theUispecDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForm()
  {
    return formEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForm_Name()
  {
    return (EAttribute)formEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForm_UsedEntities()
  {
    return (EReference)formEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForm_Fields()
  {
    return (EReference)formEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityReference()
  {
    return entityReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityReference_Entity()
  {
    return (EReference)entityReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Label()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_Widget()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_Attribute()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidget()
  {
    return widgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextFieldWidget()
  {
    return textFieldWidgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextFieldWidget_Length()
  {
    return (EAttribute)textFieldWidgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckBoxWidget()
  {
    return checkBoxWidgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComboWidget()
  {
    return comboWidgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComboWidget_Values()
  {
    return (EAttribute)comboWidgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UispecDslFactory getUispecDslFactory()
  {
    return (UispecDslFactory)getEFactoryInstance();
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
    formEClass = createEClass(FORM);
    createEAttribute(formEClass, FORM__NAME);
    createEReference(formEClass, FORM__USED_ENTITIES);
    createEReference(formEClass, FORM__FIELDS);

    entityReferenceEClass = createEClass(ENTITY_REFERENCE);
    createEReference(entityReferenceEClass, ENTITY_REFERENCE__ENTITY);

    fieldEClass = createEClass(FIELD);
    createEAttribute(fieldEClass, FIELD__LABEL);
    createEReference(fieldEClass, FIELD__WIDGET);
    createEReference(fieldEClass, FIELD__ATTRIBUTE);

    widgetEClass = createEClass(WIDGET);

    textFieldWidgetEClass = createEClass(TEXT_FIELD_WIDGET);
    createEAttribute(textFieldWidgetEClass, TEXT_FIELD_WIDGET__LENGTH);

    checkBoxWidgetEClass = createEClass(CHECK_BOX_WIDGET);

    comboWidgetEClass = createEClass(COMBO_WIDGET);
    createEAttribute(comboWidgetEClass, COMBO_WIDGET__VALUES);
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
    EntityDslPackage theEntityDslPackage = (EntityDslPackage)EPackage.Registry.INSTANCE.getEPackage(EntityDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    textFieldWidgetEClass.getESuperTypes().add(this.getWidget());
    checkBoxWidgetEClass.getESuperTypes().add(this.getWidget());
    comboWidgetEClass.getESuperTypes().add(this.getWidget());

    // Initialize classes and features; add operations and parameters
    initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForm_UsedEntities(), this.getEntityReference(), null, "usedEntities", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForm_Fields(), this.getField(), null, "fields", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityReferenceEClass, EntityReference.class, "EntityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityReference_Entity(), theEntityDslPackage.getEntity(), null, "entity", null, 0, 1, EntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_Label(), ecorePackage.getEString(), "label", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_Widget(), this.getWidget(), null, "widget", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_Attribute(), theEntityDslPackage.getAttribute(), null, "attribute", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textFieldWidgetEClass, TextFieldWidget.class, "TextFieldWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextFieldWidget_Length(), ecorePackage.getEInt(), "length", null, 0, 1, TextFieldWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkBoxWidgetEClass, CheckBoxWidget.class, "CheckBoxWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comboWidgetEClass, ComboWidget.class, "ComboWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComboWidget_Values(), ecorePackage.getEString(), "values", null, 0, -1, ComboWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //UispecDslPackageImpl
