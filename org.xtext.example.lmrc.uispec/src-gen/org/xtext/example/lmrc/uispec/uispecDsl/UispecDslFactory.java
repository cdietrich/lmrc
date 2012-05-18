/**
 */
package org.xtext.example.lmrc.uispec.uispecDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage
 * @generated
 */
public interface UispecDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UispecDslFactory eINSTANCE = org.xtext.example.lmrc.uispec.uispecDsl.impl.UispecDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form</em>'.
   * @generated
   */
  Form createForm();

  /**
   * Returns a new object of class '<em>Entity Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Reference</em>'.
   * @generated
   */
  EntityReference createEntityReference();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Widget</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Widget</em>'.
   * @generated
   */
  Widget createWidget();

  /**
   * Returns a new object of class '<em>Text Field Widget</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Field Widget</em>'.
   * @generated
   */
  TextFieldWidget createTextFieldWidget();

  /**
   * Returns a new object of class '<em>Check Box Widget</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Box Widget</em>'.
   * @generated
   */
  CheckBoxWidget createCheckBoxWidget();

  /**
   * Returns a new object of class '<em>Combo Widget</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combo Widget</em>'.
   * @generated
   */
  ComboWidget createComboWidget();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UispecDslPackage getUispecDslPackage();

} //UispecDslFactory
