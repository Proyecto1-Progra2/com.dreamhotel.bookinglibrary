package domain;

public class Room {

    private String status, style, roomNumber;
    private double price;
    private Image image;

    public Room(String roomNumber, String status, String style, double price, Image image) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.style = style;
        this.price = price;
        this.image = image;
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

    @Override
    public String toString() {
        if (this.image!=null){
            return "-"+this.roomNumber+"-"+this.status +"-"+this.style+"-"+this.price+"-"+this.image;
        }
        return "-"+this.roomNumber+"-"+this.status +"-"+this.style+"-"+this.price;
    }
}

