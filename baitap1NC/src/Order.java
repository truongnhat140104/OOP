import java.util.List;

public class Order {
    private Product product;
    private String orderDate;

    public Order(Product product, String orderDate) {
        this.product = product;
        this.orderDate = orderDate;
    }
    public Order(){}

    public void confirmOrder() {
        // Implement logic for confirming and processing the order
        System.out.println("confirm order");
    }

    public void printInvoice(List<Order> orders) {
        // Implement logic for printing an invoice
        for (Order or : orders){
            System.out.println(product);
            System.out.println(orderDate);
        }
    }
}
