package domain;

import java.time.LocalDate;

public class Booking {

    private String bookingNumber, roomNumber, hotelNumber;
    private Person host, receptionist;
    private LocalDate startDate, departureDate;

    public Booking(String bookingNumber, Person host, LocalDate startDate, LocalDate departureDate, Person receptionist, String roomNumber, String hotelNumber) {
        this.bookingNumber = bookingNumber;
        this.roomNumber = roomNumber;
        this.hotelNumber = hotelNumber;
        this.host = host;
        this.receptionist = receptionist;
        this.startDate = startDate;
        this.departureDate = departureDate;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getHotelNumber() {
        return hotelNumber;
    }

    public void setHotelNumber(String hotelNumber) {
        this.hotelNumber = hotelNumber;
    }

    public Person getHost() {
        return host;
    }

    public void setHost(Person host) {
        this.host = host;
    }

    public Person getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Person receptionist) {
        this.receptionist = receptionist;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public String toString() {
        return "|||"+this.bookingNumber+"|||"+this.host.toString()+"|||"+this.startDate+"|||"+this.departureDate+"|||"+this.receptionist.toString()+"|||"+this.roomNumber+"|||"+this.hotelNumber;
    }
}
