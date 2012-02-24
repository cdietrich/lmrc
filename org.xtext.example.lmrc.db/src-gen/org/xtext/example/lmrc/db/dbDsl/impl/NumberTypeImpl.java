/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.lmrc.db.dbDsl.impl;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.lmrc.db.dbDsl.DbDslPackage;
import org.xtext.example.lmrc.db.dbDsl.NumberType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberTypeImpl extends AbstractDataTypeImpl implements NumberType
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DbDslPackage.Literals.NUMBER_TYPE;
  }

} //NumberTypeImpl
