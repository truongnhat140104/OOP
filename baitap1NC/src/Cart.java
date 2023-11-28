public class Card {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Products product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Products product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void checkout() {
        // Implement the logic for checking out (e.g., generating an Order)
    }
}
