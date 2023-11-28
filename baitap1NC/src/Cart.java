public class Cart {
    private Product products;
    private int number;
    public Cart(Product products, Product number) {
        this.products = products;
        this.number = number.getQuantity();
    }
    public Cart(){}

    public Product getProducts() {
        return products;
    }

    public String getProductName() {
        return products.getName();
    }
}
