/**
 */
package org.xtext.example.lmrc.uispec.uispecDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.uispec.uispecDsl.Form#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.lmrc.uispec.uispecDsl.Form#getUsedEntities <em>Used Entities</em>}</li>
 *   <li>{@link org.xtext.example.lmrc.uispec.uispecDsl.Form#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getForm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.uispec.uispecDsl.Form#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Used Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.lmrc.uispec.uispecDsl.EntityReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Used Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Used Entities</em>' containment reference list.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getForm_UsedEntities()
   * @model containment="true"
   * @generated
   */
  EList<EntityReference> getUsedEntities();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.lmrc.uispec.uispecDsl.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getForm_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Form
