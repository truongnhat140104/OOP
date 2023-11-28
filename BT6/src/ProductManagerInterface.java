import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public interface ProductManagerInterface {
    default void EmployeeAddingProduct(List<Product> pro){
        Scanner scanner = new Scanner(System.in);
        System.out.println("adding product: ");
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        scanner.nextLine();
        String info = scanner.nextLine();
        int number = scanner.nextInt();
        scanner.nextLine();
        pro.add(new Product(name,price,info,number));
    }
    default void EmployeeDeletingProduct( List<Product> pro){
        Scanner scanner = new Scanner(System.in);
        System.out.println("scan the name of product");
        String name = scanner.nextLine();
        Iterator<Product> iterator = pro.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                iterator.remove(); // Remove the product from the list
                System.out.println("Product removed: " + product.getName());
            }
        }
    }
}
