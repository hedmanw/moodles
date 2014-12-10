/**
 */
package model.KeyCardService.impl;

import model.KeyCardService.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeyCardServiceFactoryImpl extends EFactoryImpl implements KeyCardServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeyCardServiceFactory init() {
		try {
			KeyCardServiceFactory theKeyCardServiceFactory = (KeyCardServiceFactory)EPackage.Registry.INSTANCE.getEFactory(KeyCardServicePackage.eNS_URI);
			if (theKeyCardServiceFactory != null) {
				return theKeyCardServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KeyCardServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KeyCardServicePackage.KEY_CARDS: return createKeyCards();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCards createKeyCards() {
		KeyCardsImpl keyCards = new KeyCardsImpl();
		return keyCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardServicePackage getKeyCardServicePackage() {
		return (KeyCardServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static KeyCardServicePackage getPackage() {
		return KeyCardServicePackage.eINSTANCE;
	}

} //KeyCardServiceFactoryImpl
