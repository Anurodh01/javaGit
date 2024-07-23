package designpatterns.builder;

public class Kitchen {
    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasOvenInstalled;
    private boolean fireplaceInstalled;

    public Kitchen(Dimension dimension, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean hasOvenInstalled, boolean fireplaceInstalled) {
        this.dimension = dimension;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.hasOvenInstalled = hasOvenInstalled;
        this.fireplaceInstalled = fireplaceInstalled;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "dimension=" + dimension +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                ", hasOvenInstalled=" + hasOvenInstalled +
                ", fireplaceInstalled=" + fireplaceInstalled +
                '}';
    }
}
