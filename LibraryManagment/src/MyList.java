
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputFilter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ducbao
 * @param <T> the type of the value
 */
public class MyList<T> {

    private Node<T> head;
    private Node<T> tail;
    Scanner sc = new Scanner(System.in);

    public boolean isEmpty() {
        return head == null;
    }

    /*Chèn node vào đầu danh sách*/
    public void insertHead(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {                                                        //Nếu danh sách rỗng
            head = tail = node;                                                 //Node mới đứng đầu danh sách
        } else {
            node.setNext(this.head);                                        //Nếu không
            this.head = node;                                                   //Cho node mới thành node đầu danh sách
        }
    }

    public void insertTail(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    /*Search item by data*/
    public Node<T> search(String data) {
        for (Node<T> p = head; p != null; p = p.getNext()) {                    //Duyệt danh sách 
            String line = String.valueOf(p.getInfo());
            String txt[] = line.split(" ");                                //Lấy chuỗi từ 1 node trong danh sách
            for (int i = 0; i < txt.length; i++) {
                if (data.equals(txt[i])) {                                      //So sánh phần tử cần tìm với phần tử trong chuỗi
                    return p;
                }
            }
        }
        return null;
    }


    /*Kiểm tra trong list có dữ liệu cần tìm hay không
      Có trả về true không có trả về false 
     */
    public boolean compare(String data) {
        for (Node<T> p = head; p != null; p = p.getNext()) {                    //Duyệt danh sách 
            String line = String.valueOf(p.getInfo());
            String txt[] = line.split(" ");                                //Lấy chuỗi từ 1 node trong danh sách
            for (int i = 0; i < txt.length; i++) {
                if (data.equals(txt[i])) {                                      //So sánh phần tử cần tìm với phần tử trong chuỗi
                    return true;
                }
            }
        }
        return false;
    }

    public void clear() {
        head = null;
    }

    /*Đọc file chứa dữ liệu của Member*/
    public MyList<T> readFileMember(String fileName, MyList<T> list) {
        try {
            FileReader flr = new FileReader(fileName);
            BufferedReader blr = new BufferedReader(flr);
            String line = "";
            while (true) {
                line = blr.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split(" ");
                String id = txt[0];
                String type = txt[1];
                String name = txt[2];
                String date = txt[3];
                String phone = txt[4];
                String mail = txt[5];
                String address = txt[6];
                String status = txt[7];
                String memberShipDateString = txt[8];
                int nBook = Integer.parseInt(txt[9]);
                Member newMember = new Member(memberShipDateString, nBook, id, type, name, date, phone, mail, address, status);

                list.insertTail((T) newMember);
            }
            flr.close();
            blr.close();
        } catch (Exception e) {
        }
        return list;
    }

    /*Đọc file chứa dữ liệu của Librarian*/
    public MyList<T> readFileLibrarian(String fileName, MyList<T> list) {
        try {
            FileReader flr = new FileReader(fileName);
            BufferedReader blr = new BufferedReader(flr);
            String line = "";
            while (true) {
                line = blr.readLine();                                          //Đọc dữ liệu file theo từng hàng
                if (line == null) {                                             //Hết dữ liệu DỪNG VÒNG LẶP (không phải dừng phương thức) 
                    break;
                }
                String txt[] = line.split(" ");                            //Tách dòng đã đọc theo kí tự khoảng trắng
                String id = txt[0];                                             //Mỗi phần tử được tách = một dữ liệu của từng phần tử trong danh sách
                String type = txt[1];
                String name = txt[2];
                String date = txt[3];
                String phone = txt[4];
                String mail = txt[5];
                String address = txt[6];
                String status = txt[7];
                String startingDate = txt[8];
                String martitalStatus = txt[9];

                /*Tạo 1 đối tượng mới cho đối tượng Librarian*/
                Librarian newLibrarian = new Librarian(id, type, name, date, phone, mail, address, status, startingDate, martitalStatus);
                list.insertTail((T) newLibrarian);                              //Thêm đối tượng mới vào danh sách CỦA ĐỐI TƯỢNG LIBRARIAN
            }
            flr.close();
            blr.close();
        } catch (Exception e) {
        }
        return list;
    }

    /*Đọc file chứa dữ liệu của Book*/
    public MyList<T> readFileBook(String fileName, MyList<T> list) {
        try {
            FileReader flr = new FileReader(fileName);
            BufferedReader blr = new BufferedReader(flr);
            String line = "";
            while (true) {
                line = blr.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split(" ");
                String id = txt[0];
                String title = txt[1];
                String author = txt[2];
                String year = txt[3];
                String publisher = txt[4];
                String status = "Available";
                Book newBook = new Book(id, title, author, year, publisher, status);
                list.insertTail((T) newBook);
            }
            flr.close();
            blr.close();
        } catch (Exception e) {
        }
        return list;
    }

    public void writeFile(String fileName, MyList<T> list) {
        try {
            FileWriter flw = new FileWriter(fileName);
            BufferedWriter blw = new BufferedWriter(flw);
            for (Node<T> p = head; p != null; p = p.getNext()) {
                blw.write(String.valueOf(p.getInfo()));                   //Vì kiểu dữ liệu của p là đối tượng Node
                blw.newLine();                                                  //Sử dụng hàm String.valueOf để chuyển p từ kiểu dữ liệu
            }                                                                   //đối tượng sang kiểu dữ liệu chuỗi
            blw.close();
            flw.close();
        } catch (Exception e) {
        }
    }

    /*Thể hiện dữ liệu theo danh sách riêng*/
    public void showList() {
        for (var p = head; p != null; p = p.getNext()) {
            System.out.println(p.getInfo().toString());
        }
    }

    /*Kiểm tra xem file rỗng hay không*/
    public boolean isFileEmty(String fileName) {
        try {
            FileReader flr = new FileReader(fileName);
            BufferedReader blr = new BufferedReader(flr);
            String line = blr.readLine();                                       //Read data from file
            if (line.equals("")) {
                return true;
            }                                                                   //Null = false / Data = true
            blr.close();
            flr.close();
        } catch (Exception e) {

        }

        return false;
    }

    public void borrowBook(MyList<T> list, MyList<Book> bookList) {
        System.out.print("Input your ID: ");                                  //Nhập thông tin để mượn sách
        String memberId = sc.next();
        System.out.print("Input the ISBN: ");
        String ISBN = sc.next();
        /*Hàm lấy ngày cộng ngày*/
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); //Chỉnh format ngày tính theo ngày hiện tại
        Calendar c1 = Calendar.getInstance();                                   //Hàm lấy ngày hiện tại
        String dueDate = dateFormat.format(c1.getTime());
        c1.roll(Calendar.DATE, 7);                                   //Cộng thêm 7 ngày vào ngày hiện tại
        String returnDate = dateFormat.format(c1.getTime());
        int i = 1;
        String blCode = "";
        for (Node<T> p = head; p != null; p = p.getNext()) {                    //Duyệt danh sách phiếu mượn
            i++;                                                                //để tạo mã phiếu mượn sách theo thứ tự
        }
        if (i < 10) {
            blCode = "00" + i;
        } else {
            blCode = "0" + i;
        }

        BookRequest book = new BookRequest(blCode, memberId, ISBN, dueDate, returnDate);
        System.out.println(book.toString());
        list.insertTail((T) book);                                              //Thêm phiếu vào danh sách phiếu mượn 

        //Sách sau khi cho mượn sẽ loại khỏi danh sách sách hiện tại
        Node<Book> node = bookList.search(ISBN);
        node.getInfo().setStatus("Loaned");

    }
}
