package domain;

import java.io.File;

public class Room {

    private String status, style, roomNumber, hotelNumber;
    private double price;
    private Image image; // Ahora es del tipo domain.Image

    public Room(String roomNumber, String status, String style, double price, Image image, String hotelNumber) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.style = style;
        this.price = price;
        this.image = image;
        this.hotelNumber = hotelNumber;
    }

    public Room(String roomNumber, String status, String style, double price, String hotelNumber) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.style = style;
        this.price = price;
        this.hotelNumber = hotelNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getHotelNumber() {
        return hotelNumber;
    }

    public void setHotelNumber(String hotelNumber) {
        this.hotelNumber = hotelNumber;
    }

    @Override
    public String toString() {
        String imageData = (this.image != null) ? this.image.toString() : "null-null";
        return "-" + this.roomNumber + "-" + this.status + "-" + this.style + "-" + this.price + "-" + imageData + "-" + this.hotelNumber;
    }

}