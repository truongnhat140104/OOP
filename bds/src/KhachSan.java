// Hotel.java
public class Hotel extends RealEstate implements BusinessFee{
    private int stars;

    public Hotel(int id, double length, double width, int stars) {
        super(id, length, width);
        this.stars = stars;
    }

    @Override
    public double calculatePrice() {
        return 100000 + stars * 50000;
    }
    @Override
    public void Price (double x){
        x = getArea();
        System.out.println("phi kinh doanh: ");
    }
}
