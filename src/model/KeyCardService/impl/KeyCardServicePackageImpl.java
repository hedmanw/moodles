/**
 */
package model.KeyCardService.impl;

import HotelSystem.HotelSystemPackage;

import HotelSystem.impl.HotelSystemPackageImpl;

import model.BankingService.BankingServicePackage;

import model.BankingService.impl.BankingServicePackageImpl;

import model.HotelService.HotelServicePackage;

import model.HotelService.impl.HotelServicePackageImpl;

import model.KeyCardService.KeyCardServiceFactory;
import model.KeyCardService.KeyCardServicePackage;
import model.KeyCardService.KeyCards;
import model.KeyCardService.KeyCardsProvides;

import model.ModelPackage;

import model.impl.ModelPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeyCardServicePackageImpl extends EPackageImpl implements KeyCardServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyCardsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyCardsProvidesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.KeyCardService.KeyCardServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KeyCardServicePackageImpl() {
		super(eNS_URI, KeyCardServiceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KeyCardServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KeyCardServicePackage init() {
		if (isInited) return (KeyCardServicePackage)EPackage.Registry.INSTANCE.getEPackage(KeyCardServicePackage.eNS_URI);

		// Obtain or create and register package
		KeyCardServicePackageImpl theKeyCardServicePackage = (KeyCardServicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KeyCardServicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KeyCardServicePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelSystemPackageImpl theHotelSystemPackage = (HotelSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelSystemPackage.eNS_URI) instanceof HotelSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelSystemPackage.eNS_URI) : HotelSystemPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		BankingServicePackageImpl theBankingServicePackage = (BankingServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) instanceof BankingServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingServicePackage.eNS_URI) : BankingServicePackage.eINSTANCE);
		HotelServicePackageImpl theHotelServicePackage = (HotelServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI) instanceof HotelServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelServicePackage.eNS_URI) : HotelServicePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theKeyCardServicePackage.createPackageContents();
		theHotelSystemPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theBankingServicePackage.createPackageContents();
		theHotelServicePackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theKeyCardServicePackage.initializePackageContents();
		theHotelSystemPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theBankingServicePackage.initializePackageContents();
		theHotelServicePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKeyCardServicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KeyCardServicePackage.eNS_URI, theKeyCardServicePackage);
		return theKeyCardServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyCards() {
		return keyCardsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyCardsProvides() {
		return keyCardsProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardServiceFactory getKeyCardServiceFactory() {
		return (KeyCardServiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		keyCardsEClass = createEClass(KEY_CARDS);

		keyCardsProvidesEClass = createEClass(KEY_CARDS_PROVIDES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(keyCardsEClass, KeyCards.class, "KeyCards", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyCardsProvidesEClass, KeyCardsProvides.class, "KeyCardsProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(keyCardsProvidesEClass, ecorePackage.getEInt(), "returnedCards", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(keyCardsProvidesEClass, ecorePackage.getEEList(), "assignCardsToReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfCards", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperation addEOperation(EClass owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EOperation o = addEOperation(owner, type, name, lowerBound, upperBound);
		o.setUnique(isUnique);
		o.setOrdered(isOrdered);
		return o;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EParameter addEParameter(EOperation owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EParameter p = ecoreFactory.createEParameter();
		p.setEType(type);
		p.setName(name);
		p.setLowerBound(lowerBound);
		p.setUpperBound(upperBound);
		p.setUnique(isUnique);
		p.setOrdered(isOrdered);
		owner.getEParameters().add(p);
		return p;
	}
	
} //KeyCardServicePackageImpl
