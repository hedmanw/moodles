package se.chalmers.mdsd1415.group11.model;

import se.chalmers.mdsd1415.group11.model.HotelService.*;

/**
 * Created by wilhelm 2014-12-12.
 */
public class ManagerSingleton {
    private static final ManagerSingleton ourInstance = new ManagerSingleton();
    public final RoomManager ROOM_MANAGER;
    public final RoomTypeManager ROOM_TYPE_MANAGER;
    public final ReservationManager RESERVATION_MANAGER;
    public final BookingManager BOOKING_MANAGER;

    public static ManagerSingleton getInstance() {
        return ourInstance;
    }

    private ManagerSingleton() {
        ROOM_MANAGER = HotelServiceFactory.eINSTANCE.createRoomManager();
        ROOM_TYPE_MANAGER = HotelServiceFactory.eINSTANCE.createRoomTypeManager();
        RESERVATION_MANAGER = HotelServiceFactory.eINSTANCE.createReservationManager();
        BOOKING_MANAGER = HotelServiceFactory.eINSTANCE.createBookingManager();
    }

}
