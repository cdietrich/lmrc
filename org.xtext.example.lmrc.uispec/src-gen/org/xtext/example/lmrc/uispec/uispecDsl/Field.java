/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.uispec.uispecDsl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.lmrc.entity.entityDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.uispec.uispecDsl.Field#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.lmrc.uispec.uispecDsl.Field#getWidget <em>Widget</em>}</li>
 *   <li>{@link org.xtext.example.lmrc.uispec.uispecDsl.Field#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getField_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.uispec.uispecDsl.Field#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Widget</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Widget</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Widget</em>' containment reference.
   * @see #setWidget(Widget)
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getField_Widget()
   * @model containment="true"
   * @generated
   */
  Widget getWidget();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.uispec.uispecDsl.Field#getWidget <em>Widget</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Widget</em>' containment reference.
   * @see #getWidget()
   * @generated
   */
  void setWidget(Widget value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getField_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.uispec.uispecDsl.Field#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

} // Field
