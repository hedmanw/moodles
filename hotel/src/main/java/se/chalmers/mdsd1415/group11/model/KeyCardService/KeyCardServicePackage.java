/**
 */
package model.KeyCardService;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.KeyCardService.KeyCardServiceFactory
 * @model kind="package"
 * @generated
 */
public interface KeyCardServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "KeyCardService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model/KeyCardService.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model.KeyCardService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KeyCardServicePackage eINSTANCE = model.KeyCardService.impl.KeyCardServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link model.KeyCardService.impl.KeyCardsImpl <em>Key Cards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.KeyCardService.impl.KeyCardsImpl
	 * @see model.KeyCardService.impl.KeyCardServicePackageImpl#getKeyCards()
	 * @generated
	 */
	int KEY_CARDS = 0;

	/**
	 * The number of structural features of the '<em>Key Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARDS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.KeyCardService.KeyCardsProvides <em>Key Cards Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.KeyCardService.KeyCardsProvides
	 * @see model.KeyCardService.impl.KeyCardServicePackageImpl#getKeyCardsProvides()
	 * @generated
	 */
	int KEY_CARDS_PROVIDES = 1;

	/**
	 * The number of structural features of the '<em>Key Cards Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CARDS_PROVIDES_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.KeyCardService.KeyCards <em>Key Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Cards</em>'.
	 * @see model.KeyCardService.KeyCards
	 * @generated
	 */
	EClass getKeyCards();

	/**
	 * Returns the meta object for class '{@link model.KeyCardService.KeyCardsProvides <em>Key Cards Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Cards Provides</em>'.
	 * @see model.KeyCardService.KeyCardsProvides
	 * @generated
	 */
	EClass getKeyCardsProvides();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KeyCardServiceFactory getKeyCardServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.KeyCardService.impl.KeyCardsImpl <em>Key Cards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.KeyCardService.impl.KeyCardsImpl
		 * @see model.KeyCardService.impl.KeyCardServicePackageImpl#getKeyCards()
		 * @generated
		 */
		EClass KEY_CARDS = eINSTANCE.getKeyCards();

		/**
		 * The meta object literal for the '{@link model.KeyCardService.KeyCardsProvides <em>Key Cards Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.KeyCardService.KeyCardsProvides
		 * @see model.KeyCardService.impl.KeyCardServicePackageImpl#getKeyCardsProvides()
		 * @generated
		 */
		EClass KEY_CARDS_PROVIDES = eINSTANCE.getKeyCardsProvides();

	}

} //KeyCardServicePackage
