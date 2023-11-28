import java.util.List;
import java.util.Scanner;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Customer(){}
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void addingOrderList(List<Product> product, List<Cart> cart){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please scan the name of product you want to add: ");
        String s = scanner.nextLine();
        for (Product pro : product){
            if (s.equals(pro.getName())){
                System.out.println("the product already have added");
                cart.add(new Cart(pro,pro);
            }
        }
    }
    public void checkListProducts(List<Cart> cart){
        for (Cart ca : cart){
            System.out.print("the product was signed: ");
            System.out.println(ca.getProducts().getName());
            System.out.print("the amount: ");
            System.out.println(ca.getProducts().getQuantity());
        }
    }
    public void orderProduct(List<Cart> cart){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean c = false;
        for (Cart ca : cart){
            if (ca.getProductName().equals(s)) System.out.println("ordered");
            c = true;
            break;
        }
        if (!c) System.out.println("Error");
    }
}
