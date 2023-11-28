import java.util.Arrays;

class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}
class Book{
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;
    public Book(String name, Author[] authors,double price ){
        this.authors=authors;
        this.name=name;
        this.price=price;
    }
    public Book(String name, Author[] authors,double price, int qty ){
        this.authors=authors;
        this.name=name;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String s="";
        for (Author author : authors) {
            s = s + "["+ author.getName()+","+author.getEmail()+","+author.getGender()+"],";
        }
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + s +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
    public String getAuthorsName(){
        String s="";
        for (int i=0;i< authors.length;i++){
            s=s+authors[i].getName()+",";
        }
        return s;
    }
}

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
        System.out.println(javaDummy.getAuthorsName());
    }
}