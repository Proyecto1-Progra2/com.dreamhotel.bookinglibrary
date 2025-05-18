package domain;

import java.util.ArrayList;

public class Room {

    private String status, style, roomNumber;
    private double price;
    private ArrayList<Image> images;

    public Room(String roomNumber, String status, String style, double price) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.style = style;
        this.price = price;
        this.images = new ArrayList<>();
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

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        String imagesString = "";
        for (Image image : images) {
            imagesString += image.toString();
        }
        return "-"+this.roomNumber+"-"+this.status +"-"+this.style+"-"+this.price+"-"+imagesString;
    }
}

