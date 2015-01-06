package hotelService;

public class RoomUnavailableException extends Exception {
    public RoomUnavailableException() {
        super("Room has already been reserved!");
    }
}
