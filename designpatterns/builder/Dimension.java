package designpatterns.builder;

public class Dimension {
    private Integer width;
    private Integer length;
    public Dimension(Integer width, Integer length) {
        this.width = width;
        this.length = length;
    }
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
