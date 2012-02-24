/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.uispec.uispecDsl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.lmrc.entity.entityDsl.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.uispec.uispecDsl.EntityReference#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getEntityReference()
 * @model
 * @generated
 */
public interface EntityReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see org.xtext.example.lmrc.uispec.uispecDsl.UispecDslPackage#getEntityReference_Entity()
   * @model
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.uispec.uispecDsl.EntityReference#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

} // EntityReference
