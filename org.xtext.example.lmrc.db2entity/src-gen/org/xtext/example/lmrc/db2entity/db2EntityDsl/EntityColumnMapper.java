/**
 */
package org.xtext.example.lmrc.db2entity.db2EntityDsl;

import org.xtext.example.lmrc.db.dbDsl.AbstractColumnMapper;

import org.xtext.example.lmrc.entity.entityDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Column Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.db2entity.db2EntityDsl.EntityColumnMapper#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslPackage#getEntityColumnMapper()
 * @model
 * @generated
 */
public interface EntityColumnMapper extends AbstractColumnMapper
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
   * @see #setEntity(Attribute)
   * @see org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslPackage#getEntityColumnMapper_Entity()
   * @model
   * @generated
   */
  Attribute getEntity();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.db2entity.db2EntityDsl.EntityColumnMapper#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Attribute value);

} // EntityColumnMapper
