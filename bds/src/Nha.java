// House.java
public class House extends RealEstate {
    private int floors;

    public House(int id, double length, double width, int floors) {
        super(id, length, width);
        this.floors = floors;
    }

    @Override
    public double calculatePrice() {
        return getArea() * 10000 + floors * 100000;
    }
}
