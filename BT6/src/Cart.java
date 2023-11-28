import java.util.List;
import java.util.Scanner;

public class Cart implements ShoppingInterface{
    private List<Cart> carts;
    private String name;
    private double price;
    private int number;
    public Cart (String name, int number){
        this.name = name;
        this.number = number;
    }
    public Cart(){
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public void AddingProductIntoCart(List<Cart> carts, List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten sp: can them vao");
        String name= scanner.nextLine();
        System.out.print("so luong: ");
        int number = scanner.nextInt();
        if (checkNameProduct(list,name) && checkNumberProduct(list, number)){
            carts.add((new Cart(name,number)));
        }
        else System.out.println("error");
    }
    public static boolean checkNameProduct (List<Product> lists, String name){
        for (Product list : lists){
            if (list.equals(name)) return true;
        }
        return false;
    }
    public static boolean checkNumberProduct (List<Product> lists, int number){
        for (Product list : lists){
            if (list.getNumber() > number) {
                list.setNumber(list.getNumber() - number);
                return true;
            }
        }
        return false;
    }
}
