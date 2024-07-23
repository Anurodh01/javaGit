package designpatterns.builder;

public interface Builder {
    Builder withDimension(Dimension dimension);

    Builder withCeilingHeight(int ceilingHeight);

    Builder withFloorNumber(int floorNumber);

    Builder withWallColor(Color wallColor);

    Builder withNumberOfWindows(int numberOfWindows);

    Builder withNumberOfDoors(int numberOfDoors);

}
