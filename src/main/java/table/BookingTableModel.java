package table;

import javafx.beans.property.SimpleStringProperty;

public class BookingTableModel {

    private final SimpleStringProperty bookingNumber, hostName, startDate, departureDate, receptionistName, roomNumber, hotelNumber;

    public BookingTableModel(String bookingNumber, String hostName, String startDate, String departureDate,
                             String receptionistName, String roomNumber, String hotelNumber) {
        this.bookingNumber = new SimpleStringProperty(bookingNumber);
        this.hostName = new SimpleStringProperty(hostName);
        this.startDate = new SimpleStringProperty(startDate);
        this.departureDate = new SimpleStringProperty(departureDate);
        this.receptionistName = new SimpleStringProperty(receptionistName);
        this.roomNumber = new SimpleStringProperty(roomNumber);
        this.hotelNumber = new SimpleStringProperty(hotelNumber);
    }

    public String getRoomNumber() {
        return roomNumber.get();
    }

    public SimpleStringProperty roomNumberProperty() {
        return roomNumber;
    }

    public String getHotelNumber() {
        return hotelNumber.get();
    }

    public SimpleStringProperty hotelNumberProperty() {
        return hotelNumber;
    }

    public String getBookingNumber() {
        return bookingNumber.get();
    }

    public SimpleStringProperty bookingNumberProperty() {
        return bookingNumber;
    }

    public String getHostName() {
        return hostName.get();
    }

    public SimpleStringProperty hostNameProperty() {
        return hostName;
    }

    public String getStartDate() {
        return startDate.get();
    }

    public SimpleStringProperty startDateProperty() {
        return startDate;
    }

    public String getDepartureDate() {
        return departureDate.get();
    }

    public SimpleStringProperty departureDateProperty() {
        return departureDate;
    }

    public String getReceptionistName() {
        return receptionistName.get();
    }

    public SimpleStringProperty receptionistNameProperty() {
        return receptionistName;
    }
}
