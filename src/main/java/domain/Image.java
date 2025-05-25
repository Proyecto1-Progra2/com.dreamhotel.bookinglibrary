package domain;

public class Image {

    private String roomNumber;
    private byte[] image;

    public Image(String roomNumber, byte[] image) {
        this.image = image;
        this.roomNumber = roomNumber;
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
        return roomNumber + " - " + (image != null ? image.length + " bytes" : "no image");
    }
}
