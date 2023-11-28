public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private Cart cart;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cart = new Cart();
    }

    public void addToCart(Product product) {
        cart.addProduct(product);
    }

    public void viewCart() {
        // Implement logic to display the products in the cart
    }

    public void placeOrder() {
        cart.checkout();
    }

    public void viewOrderHistory() {
        // Implement logic to display order history
    }
}
