// Main.java
// Land.java
public class Dat extends DiaOc {
    public Dat(int id, double length, double width) {
        super(id, length, width);
    }

    @Override
    public double calculatePrice() {
        return getArea() * 10000;
    }
}
