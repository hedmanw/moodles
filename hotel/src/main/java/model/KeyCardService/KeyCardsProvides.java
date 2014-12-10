/**
 */
package model.KeyCardService;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Cards Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.KeyCardService.KeyCardServicePackage#getKeyCardsProvides()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface KeyCardsProvides extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	int returnedCards(long reservation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" ordered="false" reservationRequired="true" reservationOrdered="false" numberOfCardsRequired="true" numberOfCardsOrdered="false"
	 * @generated
	 */
	EList assignCardsToReservation(long reservation, int numberOfCards);

} // KeyCardsProvides
