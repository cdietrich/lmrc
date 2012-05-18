/**
 */
package org.xtext.example.lmrc.uispec.uispecDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.uispec.uispecDsl.TextFieldWidget#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getTextFieldWidget()
 * @model
 * @generated
 */
public interface TextFieldWidget extends Widget
{
  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getTextFieldWidget_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.uispec.uispecDsl.TextFieldWidget#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

} // TextFieldWidget
