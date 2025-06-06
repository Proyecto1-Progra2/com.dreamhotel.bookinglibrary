package utils;

public class Action {

    // -> Acciones del Hotel
    public static final String HOTEL_REGISTER = "hotelRegister";
    public static final String HOTEL_NOT_REGISTER="hotelNoTRegister";
    public static final String HOTEL_LIST = "hotelList";
    public static final String HOTEL_SEARCH = "hotelRequest";
    public static final String HOTEL_UPDATE = "hotelUpdate";
    public static final String HOTEL_DELETE = "hotelDelete";
    public static final String HOTEL_ROOMS = "hotelRooms";


    public static final String HOTEL_REGISTERED = "hotelRegistered";
    public static final String HOTEL_NOT_REGISTERED="hotelNoTRegistered";
    public static final String HOTEL_REQUESTED = "hotelRequested";
    public static final String HOTEL_UPDATED = "hotelUpdated";
    public static final String HOTEL_DELETED = "hotelDeleted";

    // -> Acciones de las Habitaciones
    public static final String ROOM_REGISTER = "roomRegister";
    public static final String ROOM_NOT_REGISTER="roomNoTRegister";
    //hacer la accion en la libreria, y en cada view
    public static final String ROOM_LIST = "roomList";//hecho
    public static final String ROOM_SEARCH = "roomlRequest";
    public static final String ROOM_UPDATE = "roomUpdate";//hecho
    public static final String ROOM_DELETE = "roomDelete";
   //revisar esto
    public static final String ROOM_REGISTERED = "roomRegistered";
    public static final String ROOM_NOT_REGISTERED="roomNoTRegistered";
    public static final String ROOM_REQUESTED = "roomRequested";
    public static final String ROOM_UPDATED = "roomUpdated";
    public static final String ROOM_DELETED = "roomDeleted";

    // -> Acciones de imagen
    public static final String IMAGE_REQUEST = "imageRequest";

    // -> Acciones de recepcionista
    public static final String RECEPTIONIST_LOGIN = "receptionistLogin";
    public static final String RECEPTIONIST_NOT_LOGIN = "receptionistNotLogin";

    public static final String RECEPTIONIST_REGISTER = "receptionistRegister";
    public static final String RECEPTIONIST_NOT_REGISTERED="receptionistNoTRegistered";
    public static final String RECEPTIONIST_REGISTERED = "receptionistRegistered";
    public static final String RECEPTIONIST_SEARCH = "receptionistRequest";

    // -> Acciones de Booking
    public static final String BOOKING_REGISTER = "bookingRegister";
    public static final String REQUEST_BOOKING_NUMBER = "bookingNumber";
    public static final String BOOKING_NUMBER_EXIST = "bookingExist";
    public static final String BOOKING_NUMBER_NO_EXIST = "bookingNoExist";
    public static final String BOOKING_LIST = "bookingList";
    public static final String BOOKING_DELETE = "bookingDelete";
    public static final String HOTEL_ROOMS_BOOKING = "hotelRoomsBooking";
    public static final String BOOKING_REGISTERED = "bookingRegistered";

    public static final String HOST_REGISTER = "hostRegister";
    public static final String HOST_NOT_REGISTERED = "host_not_registered";
    public static final String HOST_REGISTERED = "hostRegistered";
    public static final String HOST_REQUEST = "hostRequest";
    public static final String HOST_EXIST = "hostExist";
    public static final String HOST_NO_EXIST = "hostNoExist";

}
