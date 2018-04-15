package Room;

import Guest.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {
    private int roomNumber;
    private RoomType bedroomType;

    public Bedroom(int capacity, ArrayList<Guest> guests, int roomNumber, RoomType bedroomType){
        super(capacity, guests);
        this.bedroomType = bedroomType;
        this.roomNumber = roomNumber;
    }

    public int getRoomCapacity() {
        return RoomType.getRoomCapacity();
    }


}
