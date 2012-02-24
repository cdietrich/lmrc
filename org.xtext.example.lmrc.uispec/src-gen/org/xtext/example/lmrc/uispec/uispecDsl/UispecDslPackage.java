/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.uispec.uispecDsl;

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
 * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslFactory
 * @model kind="package"
 * @generated
 */
public interface UispecDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "uispecDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/lmrc/uispec/UispecDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "uispecDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UispecDslPackage eINSTANCE = org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.FormImpl <em>Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.FormImpl
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getForm()
   * @generated
   */
  int FORM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__NAME = 0;

  /**
   * The feature id for the '<em><b>Used Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__USED_ENTITIES = 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__FIELDS = 2;

  /**
   * The number of structural features of the '<em>Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.EntityReferenceImpl
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getEntityReference()
   * @generated
   */
  int ENTITY_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE__ENTITY = 0;

  /**
   * The number of structural features of the '<em>Entity Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.FieldImpl
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getField()
   * @generated
   */
  int FIELD = 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LABEL = 0;

  /**
   * The feature id for the '<em><b>Widget</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__WIDGET = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ATTRIBUTE = 2;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.WidgetImpl
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 3;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.TextFieldWidgetImpl <em>Text Field Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.TextFieldWidgetImpl
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getTextFieldWidget()
   * @generated
   */
  int TEXT_FIELD_WIDGET = 4;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_WIDGET__LENGTH = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Field Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.CheckBoxWidgetImpl <em>Check Box Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.CheckBoxWidgetImpl
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getCheckBoxWidget()
   * @generated
   */
  int CHECK_BOX_WIDGET = 5;

  /**
   * The number of structural features of the '<em>Check Box Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.ComboWidgetImpl <em>Combo Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.ComboWidgetImpl
   * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getComboWidget()
   * @generated
   */
  int COMBO_WIDGET = 6;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_WIDGET__VALUES = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Combo Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.uispec.uispecDsl.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.Form
   * @generated
   */
  EClass getForm();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.lmrc.uispec.uispecDsl.Form#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.Form#getName()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.lmrc.uispec.uispecDsl.Form#getUsedEntities <em>Used Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Used Entities</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.Form#getUsedEntities()
   * @see #getForm()
   * @generated
   */
  EReference getForm_UsedEntities();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.lmrc.uispec.uispecDsl.Form#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.Form#getFields()
   * @see #getForm()
   * @generated
   */
  EReference getForm_Fields();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.uispec.uispecDsl.EntityReference <em>Entity Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Reference</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.EntityReference
   * @generated
   */
  EClass getEntityReference();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.lmrc.uispec.uispecDsl.EntityReference#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.EntityReference#getEntity()
   * @see #getEntityReference()
   * @generated
   */
  EReference getEntityReference_Entity();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.uispec.uispecDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.lmrc.uispec.uispecDsl.Field#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.Field#getLabel()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.lmrc.uispec.uispecDsl.Field#getWidget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Widget</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.Field#getWidget()
   * @see #getField()
   * @generated
   */
  EReference getField_Widget();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.lmrc.uispec.uispecDsl.Field#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.Field#getAttribute()
   * @see #getField()
   * @generated
   */
  EReference getField_Attribute();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.uispec.uispecDsl.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.uispec.uispecDsl.TextFieldWidget <em>Text Field Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Field Widget</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.TextFieldWidget
   * @generated
   */
  EClass getTextFieldWidget();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.lmrc.uispec.uispecDsl.TextFieldWidget#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.TextFieldWidget#getLength()
   * @see #getTextFieldWidget()
   * @generated
   */
  EAttribute getTextFieldWidget_Length();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.uispec.uispecDsl.CheckBoxWidget <em>Check Box Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box Widget</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.CheckBoxWidget
   * @generated
   */
  EClass getCheckBoxWidget();

  /**
   * Returns the meta object for class '{@link org.xtext.example.lmrc.uispec.uispecDsl.ComboWidget <em>Combo Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combo Widget</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.ComboWidget
   * @generated
   */
  EClass getComboWidget();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.lmrc.uispec.uispecDsl.ComboWidget#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.ComboWidget#getValues()
   * @see #getComboWidget()
   * @generated
   */
  EAttribute getComboWidget_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UispecDslFactory getUispecDslFactory();

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
     * The meta object literal for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.FormImpl <em>Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.FormImpl
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getForm()
     * @generated
     */
    EClass FORM = eINSTANCE.getForm();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__NAME = eINSTANCE.getForm_Name();

    /**
     * The meta object literal for the '<em><b>Used Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM__USED_ENTITIES = eINSTANCE.getForm_UsedEntities();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM__FIELDS = eINSTANCE.getForm_Fields();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.EntityReferenceImpl
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getEntityReference()
     * @generated
     */
    EClass ENTITY_REFERENCE = eINSTANCE.getEntityReference();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_REFERENCE__ENTITY = eINSTANCE.getEntityReference_Entity();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.FieldImpl
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__LABEL = eINSTANCE.getField_Label();

    /**
     * The meta object literal for the '<em><b>Widget</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__WIDGET = eINSTANCE.getField_Widget();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__ATTRIBUTE = eINSTANCE.getField_Attribute();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.WidgetImpl
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.TextFieldWidgetImpl <em>Text Field Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.TextFieldWidgetImpl
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getTextFieldWidget()
     * @generated
     */
    EClass TEXT_FIELD_WIDGET = eINSTANCE.getTextFieldWidget();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_FIELD_WIDGET__LENGTH = eINSTANCE.getTextFieldWidget_Length();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.CheckBoxWidgetImpl <em>Check Box Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.CheckBoxWidgetImpl
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getCheckBoxWidget()
     * @generated
     */
    EClass CHECK_BOX_WIDGET = eINSTANCE.getCheckBoxWidget();

    /**
     * The meta object literal for the '{@link org.xtext.example.lmrc.uispec.uispecDsl.impl.ComboWidgetImpl <em>Combo Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.ComboWidgetImpl
     * @see org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslPackageImpl#getComboWidget()
     * @generated
     */
    EClass COMBO_WIDGET = eINSTANCE.getComboWidget();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMBO_WIDGET__VALUES = eINSTANCE.getComboWidget_Values();

  }

} //UispecDslPackage
