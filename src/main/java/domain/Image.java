package domain;

public class Image {

    private String roomNumber, hotelNumber;
    private byte[] image;

    public Image(String roomNumber, String hotelNumber, byte[] image) {
        this.image = image;
        this.roomNumber = roomNumber;
        this.hotelNumber = hotelNumber;
    }

    public String getHotelNumber() {
        return hotelNumber;
    }

    public void setHotelNumber(String hotelNumber) {
        this.hotelNumber = hotelNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return roomNumber +"|||"+hotelNumber+ "|||" + (image != null ? image.length + "bytes" : "no image");
    }
}
