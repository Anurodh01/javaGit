package designpatterns.builder;

public final class BedRoomBuilder implements Builder {
    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public static BedRoomBuilder aBedRoom(){
        return new BedRoomBuilder();
    }
    @Override
    public BedRoomBuilder withDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    @Override
    public BedRoomBuilder withCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public BedRoomBuilder withFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public BedRoomBuilder withWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    @Override
    public BedRoomBuilder withNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public BedRoomBuilder withNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public BedRoomBuilder withIsDouble(boolean isDouble) {
        this.isDouble = isDouble;
        return this;
    }

    public BedRoomBuilder withHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
        return this;
    }

    public BedRoom build() {
        return new BedRoom(dimension, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, isDouble, hasEnsuite);
    }
}
