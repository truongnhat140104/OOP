import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "books.txt"; // Đường dẫn đến tệp văn bản chứa dữ liệu sách
        List<Catalog> catalogList = readCatalogFromFile(filePath);
        for (Catalog catalog : catalogList) {
            System.out.println("thong tin sach:");
            System.out.println("Tựa sách: " + catalog.getTitle());
            System.out.println("ISBN: " + catalog.getISBN());
            System.out.println("Tác giả: " + catalog.getAuthors());
            System.out.println("nam xuat ban: " + catalog.getYear());
            System.out.println("Nhà xuất bản: " + catalog.getPublisher());
            System.out.println("Tình trạng: " + catalog.getStatus());
        }
    }

    public static List<Catalog> readCatalogFromFile(String filePath) {
        List<Catalog> catalogList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Tách dữ liệu dựa trên dấu phẩy
                if (parts.length == 6) {
                    String title = parts[0].trim();
                    String ISBN = parts[1].trim();
                    String authors = parts[2].trim();
                    String year = (parts[3].trim());
                    String publisher = parts[4].trim();
                    String status = parts[5];
                    // Tạo đối tượng Catalog và thêm vào danh sách
                    Catalog catalog = new Catalog(ISBN, title, authors, year, publisher, status);
                    catalogList.add(catalog);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return catalogList;
    }
}

class Catalog {
    private String ISBN;
    private String title;
    private String authors;
    private String year;
    private String publisher;
    private String status;

    public Catalog(String ISBN, String title, String authors, String year, String publisher, String status) {
        this.ISBN = ISBN;
        this.title = title;
        this.authors = authors;
        this.year = year;
        this.publisher = publisher;
        this.status = status;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public String getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getStatus() {
        return status;
    }
}