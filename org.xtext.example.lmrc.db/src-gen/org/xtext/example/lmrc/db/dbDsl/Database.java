/**
 */
package org.xtext.example.lmrc.db.dbDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.db.dbDsl.Database#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.lmrc.db.dbDsl.Database#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.lmrc.db.dbDsl.DbDslPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends Root
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
   * @see org.xtext.example.lmrc.db.dbDsl.DbDslPackage#getDatabase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.lmrc.db.dbDsl.Database#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.lmrc.db.dbDsl.Table}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see org.xtext.example.lmrc.db.dbDsl.DbDslPackage#getDatabase_Tables()
   * @model containment="true"
   * @generated
   */
  EList<Table> getTables();

} // Database
