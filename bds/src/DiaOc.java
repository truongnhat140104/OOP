// RealEstate.java
    public abstract class RealEstate {
    protected int id;
    protected double length;
    protected double width;

    public RealEstate(int id, double length, double width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }

    public abstract double calculatePrice();

    public double getArea() {
        return length * width;
    }
}
