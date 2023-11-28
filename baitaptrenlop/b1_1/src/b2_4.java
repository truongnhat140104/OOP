class Customer{
    private int id;
    private String name;
    private int discount;
    public Customer(int id, String name, int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getDiscount(){
        return this.discount;
    }
    public void setDiscount(int discount){
        this.discount=discount;
    }
    public String toString() {
        return name + "("+id+")(" + (discount)+"%)";
    }
}
class Invoice{
    private int id;
    Customer customer;
    private double amount;
    public Invoice(int id, Customer customer, double amount){
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }
    public int getId(){
        return this.id;
    }
    public Customer getCustomer(){
        return this.customer;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    public double getAmount(){
        return this.amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }


}
public class b2_4{
    public static void Main (String[] args){
        System.out.println("hello");
    }
}
