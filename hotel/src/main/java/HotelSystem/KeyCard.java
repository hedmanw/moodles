/**
 */
package HotelSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link HotelSystem.KeyCard#getKeyCardID <em>Key Card ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see HotelSystem.HotelSystemPackage#getKeyCard()
 * @model
 * @generated
 */
public interface KeyCard extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Card ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Card ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Card ID</em>' attribute.
	 * @see #setKeyCardID(int)
	 * @see HotelSystem.HotelSystemPackage#getKeyCard_KeyCardID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getKeyCardID();

	/**
	 * Sets the value of the '{@link HotelSystem.KeyCard#getKeyCardID <em>Key Card ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Card ID</em>' attribute.
	 * @see #getKeyCardID()
	 * @generated
	 */
	void setKeyCardID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyCardIDRequired="true" keyCardIDOrdered="false"
	 * @generated
	 */
	void setID(int keyCardID);

} // KeyCard
