import java.util.List;

public class Product implements ProductManagerInterface{
    private String name;
    private double price;
    private String info;
    private int number;
    public Product(String name,double price,String info,int number){
        this.name=name;
        this.info=info;
        this.price=price;
        this.number=number;
    }
    public Product(){}

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public class Stock{
        public void infoProduct(List<Product> pro){
            System.out.println("all product");
            for(Product product:pro){
                System.out.println("Product Name: " + product.name);
                System.out.println("Price: " + product.price);
                System.out.println("Info: " + product.info);
                System.out.println("Number: " + product.number);
                System.out.println();
            }
        }

    }

}
