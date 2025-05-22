package table;

import javafx.beans.property.SimpleStringProperty;

public class HotelTableModel {
    private final SimpleStringProperty hotelNumber;
    private final SimpleStringProperty hotelName;
    private final SimpleStringProperty hotelAddress;

    public HotelTableModel(String hotelNumber, String hotelName, String hotelAddress) {
        this.hotelNumber = new SimpleStringProperty(hotelNumber);
        this.hotelName = new SimpleStringProperty(hotelName);
        this.hotelAddress = new SimpleStringProperty(hotelAddress);
    }

    public String getHotelNumber() {
        return hotelNumber.get();
    }

    public SimpleStringProperty hotelNumberProperty() {
        return hotelNumber;
    }

    public String getHotelName() {
        return hotelName.get();
    }

    public SimpleStringProperty hotelNameProperty() {
        return hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress.get();
    }

    public SimpleStringProperty hotelAddressProperty() {
        return hotelAddress;
    }
}

