/**
 */
package org.xtext.example.lmrc.uispec.uispecDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.uispec.uispecDsl.ComboWidget#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getComboWidget()
 * @model
 * @generated
 */
public interface ComboWidget extends Widget
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getComboWidget_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // ComboWidget
