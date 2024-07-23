package designpatterns.builder;

import java.util.List;

public class House {
    private List<BedRoom> bedRooms;
    private Kitchen kitchen;
    public House(){}
    public House(List<BedRoom> bedRooms, Kitchen kitchen) {
        this.bedRooms = bedRooms;
        this.kitchen = kitchen;
    }

    @Override
    public String toString() {
        return "House{" +
                "bedRooms=" + bedRooms +
                ", kitchen=" + kitchen +
                '}';
    }

    public List<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(List<BedRoom> bedRooms) {
        this.bedRooms = bedRooms;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}
