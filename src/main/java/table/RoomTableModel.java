package table;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class RoomTableModel {
    private final SimpleStringProperty roomNumber;
    private final SimpleStringProperty roomStatus;
    private final SimpleStringProperty roomStyle;
    private final SimpleDoubleProperty roomPrice;
    private final SimpleStringProperty roomHotelNumber;

    public RoomTableModel(String roomNumber, String roomStatus, String roomStyle, double roomPrice, String roomHotelNumber) {
        this.roomNumber = new SimpleStringProperty(roomNumber);
        this.roomStatus = new SimpleStringProperty(roomStatus);
        this.roomStyle = new SimpleStringProperty(roomStyle);
        this.roomPrice = new SimpleDoubleProperty(roomPrice);
        this.roomHotelNumber = new SimpleStringProperty(roomHotelNumber);
    }

    public String getRoomHotelNumber() {
        return roomHotelNumber.get();
    }

    public SimpleStringProperty roomHotelNumberProperty() {
        return roomHotelNumber;
    }

    public String getRoomNumber() {
        return roomNumber.get();
    }

    public SimpleStringProperty roomNumberProperty() {
        return roomNumber;
    }

    public String getRoomStatus() {
        return roomStatus.get();
    }

    public SimpleStringProperty roomStatusProperty() {
        return roomStatus;
    }

    public String getRoomStyle() {
        return roomStyle.get();
    }

    public SimpleStringProperty roomStyleProperty() {
        return roomStyle;
    }

    public double getRoomPrice() {
        return roomPrice.get();
    }

    public SimpleDoubleProperty roomPriceProperty() {
        return roomPrice;
    }
}

