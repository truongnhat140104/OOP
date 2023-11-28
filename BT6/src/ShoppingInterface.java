import java.util.List;

public interface ShoppingInterface {
    void AddingProductIntoCart(List<Cart> carts,List<Product> products);
    default void Sum(List<Cart> carts){
        int sum = 0;
        for (Cart cart: carts){
            sum += cart.getNumber() * cart.getPrice();
        }
        System.out.println(sum);
    }
}
