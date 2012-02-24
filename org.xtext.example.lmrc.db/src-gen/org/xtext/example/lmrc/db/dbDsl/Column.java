/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.db.dbDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.db.dbDsl.Column#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.lmrc.db.dbDsl.Column#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.lmrc.db.dbDsl.Column#getMapper <em>Mapper</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.db.dbDsl.DbDslPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AbstractDataType)
   * @see org.xtext.example.lmrc.db.dbDsl.DbDslPackage#getColumn_Type()
   * @model containment="true"
   * @generated
   */
  AbstractDataType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.db.dbDsl.Column#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AbstractDataType value);

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
   * @see org.xtext.example.lmrc.db.dbDsl.DbDslPackage#getColumn_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.db.dbDsl.Column#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mapper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapper</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapper</em>' containment reference.
   * @see #setMapper(AbstractColumnMapper)
   * @see org.xtext.example.lmrc.db.dbDsl.DbDslPackage#getColumn_Mapper()
   * @model containment="true"
   * @generated
   */
  AbstractColumnMapper getMapper();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.db.dbDsl.Column#getMapper <em>Mapper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapper</em>' containment reference.
   * @see #getMapper()
   * @generated
   */
  void setMapper(AbstractColumnMapper value);

} // Column
