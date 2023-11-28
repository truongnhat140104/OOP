// Villa.java
public class BietThu extends DiaOc {

    public BietThu(int id, double length, double width) {
        super(id, length, width);
    }

    @Override
    public double calculatePrice() {
        return getArea() * 400000;
    }
    public double Price (double price){
        return price * 1000;
    }
}
