/**
 */
package org.xtext.example.lmrc.uispec.uispecDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.lmrc.uispec.uispecDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UispecDslFactoryImpl extends EFactoryImpl implements UispecDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UispecDslFactory init()
  {
    try
    {
      UispecDslFactory theUispecDslFactory = (UispecDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/lmrc/uispec/UispecDsl"); 
      if (theUispecDslFactory != null)
      {
        return theUispecDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UispecDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UispecDslFactoryImpl()
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
      case UispecDslPackage.FORM: return createForm();
      case UispecDslPackage.ENTITY_REFERENCE: return createEntityReference();
      case UispecDslPackage.FIELD: return createField();
      case UispecDslPackage.WIDGET: return createWidget();
      case UispecDslPackage.TEXT_FIELD_WIDGET: return createTextFieldWidget();
      case UispecDslPackage.CHECK_BOX_WIDGET: return createCheckBoxWidget();
      case UispecDslPackage.COMBO_WIDGET: return createComboWidget();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Form createForm()
  {
    FormImpl form = new FormImpl();
    return form;
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
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Widget createWidget()
  {
    WidgetImpl widget = new WidgetImpl();
    return widget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextFieldWidget createTextFieldWidget()
  {
    TextFieldWidgetImpl textFieldWidget = new TextFieldWidgetImpl();
    return textFieldWidget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckBoxWidget createCheckBoxWidget()
  {
    CheckBoxWidgetImpl checkBoxWidget = new CheckBoxWidgetImpl();
    return checkBoxWidget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComboWidget createComboWidget()
  {
    ComboWidgetImpl comboWidget = new ComboWidgetImpl();
    return comboWidget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UispecDslPackage getUispecDslPackage()
  {
    return (UispecDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UispecDslPackage getPackage()
  {
    return UispecDslPackage.eINSTANCE;
  }

} //UispecDslFactoryImpl
