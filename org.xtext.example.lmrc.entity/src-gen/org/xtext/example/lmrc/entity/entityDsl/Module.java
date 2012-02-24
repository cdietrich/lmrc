/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.entity.entityDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.entity.entityDsl.Module#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Named
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.lmrc.entity.entityDsl.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.xtext.example.lmrc.entity.entityDsl.EntityDslPackage#getModule_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

} // Module
