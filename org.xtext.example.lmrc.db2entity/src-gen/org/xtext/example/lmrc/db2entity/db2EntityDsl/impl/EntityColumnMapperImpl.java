/**
 */
package org.xtext.example.lmrc.db2entity.db2EntityDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.lmrc.db.dbDsl.impl.AbstractColumnMapperImpl;

import org.xtext.example.lmrc.db2entity.db2EntityDsl.Db2EntityDslPackage;
import org.xtext.example.lmrc.db2entity.db2EntityDsl.EntityColumnMapper;

import org.xtext.example.lmrc.entity.entityDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Column Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.lmrc.db2entity.db2EntityDsl.impl.EntityColumnMapperImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityColumnMapperImpl extends AbstractColumnMapperImpl implements EntityColumnMapper
{
  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Attribute entity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityColumnMapperImpl()
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
    return Db2EntityDslPackage.Literals.ENTITY_COLUMN_MAPPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (Attribute)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Db2EntityDslPackage.ENTITY_COLUMN_MAPPER__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(Attribute newEntity)
  {
    Attribute oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Db2EntityDslPackage.ENTITY_COLUMN_MAPPER__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Db2EntityDslPackage.ENTITY_COLUMN_MAPPER__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Db2EntityDslPackage.ENTITY_COLUMN_MAPPER__ENTITY:
        setEntity((Attribute)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Db2EntityDslPackage.ENTITY_COLUMN_MAPPER__ENTITY:
        setEntity((Attribute)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Db2EntityDslPackage.ENTITY_COLUMN_MAPPER__ENTITY:
        return entity != null;
    }
    return super.eIsSet(featureID);
  }

} //EntityColumnMapperImpl
