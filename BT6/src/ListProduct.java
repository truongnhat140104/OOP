import java.util.ArrayList;
import java.util.List;

public class ListProduct {
    public static void Listproduct(List<Product> products){
        products.add(new Product("Smartphone", 599.99, "Latest model with high-resolution camera", 100));
        products.add(new Product("Laptop", 999.99, "15-inch display, powerful processor", 50));
        products.add(new Product("Headphones", 99.99, "Noise-canceling, wireless Bluetooth", 200));
        products.add(new Product("Smartwatch", 199.99, "Fitness tracking and notification support", 75));
        products.add(new Product("Coffee Maker", 49.99, "12-cup programmable coffee machine", 30));
        products.add(new Product("Running Shoes", 79.99, "Lightweight and comfortable for jogging", 120));
        products.add(new Product("Backpack", 39.99, "Spacious with multiple compartments", 80));
        products.add(new Product("Blender", 69.99, "High-speed, great for making smoothies", 60));
        products.add(new Product("Digital Camera", 449.99, "20MP, 4K video recording", 25));
        products.add(new Product("Gaming Console", 399.99, "4K gaming experience, comes with controller", 35));
    }
}
