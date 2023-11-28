// Hotel.java
public class KhachSan extends DiaOc implements PhiKinhDoanh {
    private int stars;

    public KhachSan(int id, double length, double width, int stars) {
        super(id, length, width);
        this.stars = stars;
    }

    @Override
    public double calculatePrice() {
        return 100000 + stars * 50000;
    }
    @Override
    public double Price (double price){
        return price * 5000;
    }
}
