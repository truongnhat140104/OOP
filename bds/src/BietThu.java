// Villa.java
public class Villa extends RealEstate {

    public Villa(int id, double length, double width) {
        super(id, length, width);
    }

    @Override
    public double calculatePrice() {
        return getArea() * 400000;
    }
}
