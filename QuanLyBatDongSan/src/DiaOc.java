// RealEstate.java
    public abstract class DiaOc {
    protected int id;
    protected double length;
    protected double width;

    public DiaOc(int id, double length, double width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public abstract double calculatePrice();

    public double getArea() {
        return length * width;
    }
}
