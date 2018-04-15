package Hotel;

import Room.Bedroom;
import Room.ConferenceRoom;
import Room.DiningRoom;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedRooms;
    private ArrayList<ConferenceRoom> conRooms;
    private ArrayList<DiningRoom> dinRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conRooms, ArrayList<DiningRoom> dinRooms) {
        this.name = name;
        this.bedRooms = bedrooms;
        this.conRooms = conRooms;
        this.dinRooms = dinRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bedroom> getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(ArrayList<Bedroom> bedRooms) {
        this.bedRooms = bedRooms;
    }

    public ArrayList<ConferenceRoom> getConRooms() {
        return conRooms;
    }

    public void setConRooms(ArrayList<ConferenceRoom> conRooms) {
        this.conRooms = conRooms;
    }

    public ArrayList<DiningRoom> getDinRooms() {
        return dinRooms;
    }

    public void setDinRooms(ArrayList<DiningRoom> dinRooms) {
        this.dinRooms = dinRooms;
    }
}
