package hotelService;

import com.sun.deploy.uitoolkit.impl.fx.HostServicesFactory;

/**
 * Created by wilhelm 2014-12-12.
 */
public class ManagerSingleton {
    private static final ManagerSingleton ourInstance = new ManagerSingleton();
    public final RoomManager ROOM_MANAGER;
    public final RoomTypeManager ROOM_TYPE_MANAGER;
    public final ReservationManager RESERVATION_MANAGER;
    public final BookingManager BOOKING_MANAGER;
    public final CustomerManager CUSTOMER_MANAGER;

    public static ManagerSingleton getInstance() {
        return ourInstance;
    }

    private ManagerSingleton() {
        ROOM_MANAGER = HotelServiceFactory.eINSTANCE.createRoomManager();
        ROOM_TYPE_MANAGER = HotelServiceFactory.eINSTANCE.createRoomTypeManager();
        RESERVATION_MANAGER = HotelServiceFactory.eINSTANCE.createReservationManager();
        BOOKING_MANAGER = HotelServiceFactory.eINSTANCE.createBookingManager();
        CUSTOMER_MANAGER = HotelServiceFactory.eINSTANCE.createCustomerManager();
    }

}
