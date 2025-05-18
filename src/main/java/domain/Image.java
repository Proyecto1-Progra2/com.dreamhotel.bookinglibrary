package domain;

import java.io.File;

public class Image {

    private String roomNumber;
    private File image;

    public Image(File image, String roomNumber) {
        this.image = image;
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "-"+this.roomNumber +"-"+this.image;
    }
}
