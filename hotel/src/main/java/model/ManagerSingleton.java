package model;

import model.HotelService.HotelServiceFactory;
import model.HotelService.ReservationManager;
import model.HotelService.RoomManager;
import model.HotelService.RoomTypeManager;

/**
 * Created by wilhelm 2014-12-12.
 */
public class ManagerSingleton {
    private static final ManagerSingleton ourInstance = new ManagerSingleton();
    public final RoomManager ROOM_MANAGER;
    public final RoomTypeManager ROOM_TYPE_MANAGER;
    public final ReservationManager RESERVATION_MANAGER;

    public static ManagerSingleton getInstance() {
        return ourInstance;
    }

    private ManagerSingleton() {
        ROOM_MANAGER = HotelServiceFactory.eINSTANCE.createRoomManager();
        ROOM_TYPE_MANAGER = HotelServiceFactory.eINSTANCE.createRoomTypeManager();
        RESERVATION_MANAGER = HotelServiceFactory.eINSTANCE.createReservationManager();
    }

}
