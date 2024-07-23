package designpatterns.builder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         //Room1
        BedRoom room1 = BedRoomBuilder.aBedRoom()
                .withDimension(new Dimension(10,20))
                .withCeilingHeight(30)
                .withIsDouble(true)
                .withFloorNumber(2)
                .withWallColor(Color.GREEN)
                .withNumberOfWindows(4)
                .withNumberOfDoors(2).withHasEnsuite(false).build();
        //Room2
        BedRoom room2 = BedRoomBuilder.aBedRoom()
                .withDimension(new Dimension(20,40))
                .withWallColor(Color.PINK)
                .withFloorNumber(1)
                .build();

         //Kitchen
        Kitchen kitchen = KitchenBuilder.aKitchen()
                .withDimension(new Dimension(20,40))
                .withFireplaceInstalled(true)
                .withWallColor(Color.RED)
                .withNumberOfDoors(1)
                .build();
        //list of rooms

        ArrayList<BedRoom> rooms = RoomListBuilder.aRoomList()
                .addRoom(room1)
                .addRoom(room2)
                .build();

        //House creation
        House house = new House();
        house.setBedRooms(rooms);
        house.setKitchen(kitchen);
        System.out.println(house);
    }
}
