package designpatterns.builder;

public final class KitchenBuilder implements Builder{
    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasOvenInstalled;
    private boolean fireplaceInstalled;

    private KitchenBuilder() {
    }

    public static KitchenBuilder aKitchen() {
        return new KitchenBuilder();
    }

    @Override
    public KitchenBuilder withDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }


    @Override
    public KitchenBuilder withCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public KitchenBuilder withFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public KitchenBuilder withWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    @Override
    public KitchenBuilder withNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public KitchenBuilder withNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public KitchenBuilder withHasOvenInstalled(boolean hasOvenInstalled) {
        this.hasOvenInstalled = hasOvenInstalled;
        return this;
    }

    public KitchenBuilder withFireplaceInstalled(boolean fireplaceInstalled) {
        this.fireplaceInstalled = fireplaceInstalled;
        return this;
    }

    public Kitchen build() {
        return new Kitchen(dimension, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, hasOvenInstalled, fireplaceInstalled);
    }
}
