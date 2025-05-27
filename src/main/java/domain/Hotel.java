package domain;

import java.util.ArrayList;

public class Hotel {

    private String number, name, address;
    private ArrayList<Room> rooms;

    public Hotel(String number, String name, String address, ArrayList<Room> rooms) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.rooms = rooms;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        String rooms = "";
        for (Room room : this.rooms) {
            rooms += room.toString();
        }
        return "|||" + this.number + "|||" + this.name + "|||" + this.address + rooms;
    }

}
