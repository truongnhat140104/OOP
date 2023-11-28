import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        List<Cart> carts = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("John Doe", "123 Main Street, City", "555-123-4567"));
        customers.add(new Customer("Alice Smith", "456 Elm Avenue, Town", "555-987-6543"));
        customers.add(new Customer("Bob Johnson", "789 Oak Lane, Village", "555-555-5555"));

        products.add(new Product("Dell XPS 15 Laptop", 1499.99, "High-end laptop with OLED display and powerful CPU.", 20));
        products.add(new Product("iPhone 13 Mobile Phone", 799.99, "New smartphone with improved camera.", 30));
        products.add(new Product("Samsung Galaxy Tab S7 Tablet", 649.99, "Powerful Android tablet with S Pen.", 15));
        products.add(new Product("North Face Waterproof Jacket", 199.99, "Waterproof jacket for winter.", 50));
        products.add(new Product("Levi's Jeans", 59.99, "Men's and women's jeans from Levi's.", 100));
        products.add(new Product("Nike Air Max Sneakers", 129.99, "Stylish Nike sneakers.", 40));
        products.add(new Product("Canon EOS Rebel T7i Camera", 799.99, "DSLR camera for beginners.", 10));
        products.add(new Product("Bose QuietComfort 35 II Headphones", 349.99, "Noise-canceling headphones with great sound quality.", 25));
        products.add(new Product("Ikea Linnmon Desk", 129.99, "Simple and popular desk from Ikea.", 60));
        products.add(new Product("TaoTronics Reading Desk Lamp", 19.99, "Versatile LED desk lamp for reading and working.", 80));

        System.out.println("Customer Information:");
        for (Customer customer : customers) {
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Address: " + customer.getAddress());
            System.out.println("Phone Number: " + customer.getPhoneNumber());
            System.out.println();
        }

        System.out.println("Product Information:");
        for (Product product : products) {
            System.out.println("Product Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Quantity in Stock: " + product.getQuantity());
            System.out.println();
        }
        Customer cus1 = new Customer();
        Cart cart1 = new Cart();
        cus1.addingOrderList(products,carts);
        cus1.checkListProducts(carts);
    }
}