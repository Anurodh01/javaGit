package designpatterns.builder;

import java.util.ArrayList;

public class RoomListBuilder {
    private ArrayList<BedRoom> rooms;
    public static RoomListBuilder aRoomList(){
        return new RoomListBuilder();
    }
    RoomListBuilder(){
        this.rooms= new ArrayList<>();
    }
    public RoomListBuilder addRoom(BedRoom room){
        rooms.add(room);
        return this;
    }
    public ArrayList<BedRoom> build(){
        return this.rooms;
    }
}
