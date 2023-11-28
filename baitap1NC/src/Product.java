public class Products {
    private String name;
    private double price;
    private String description;
    private int quantity;

    public Products(String name, double price, String description, int quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }
    public String toString() {
        return name + " - $" + price;
    }
}
