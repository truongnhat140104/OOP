
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ducbao
 */
public class Main {

    /*Tạo menu cho quản lý thư viện*/
    public static void librarianMenu() {
        System.out.println("1/ Search book by id or title");

        System.out.println("2/ Search member account by name or id");

        System.out.println("3/ Search borrow book ticket by title or member id");
    }

    /*Tạo menu cho người dùng*/
    public static void memberMenu() {
        System.out.println("1/ Search book by id or title");

        System.out.println("2/ Borrow book");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fileMember = "Member.txt";
        String fileLibrarian = "Librarian.txt";
        String fileBook = "Book.txt";
        String fileBookRequest = "BookRequest.txt";

        /*Tạo list cho từng đối tượng*/
        MyList<Member> memberList = new MyList<>();
        MyList<Librarian> librarianList = new MyList<>();
        MyList<Book> bookList = new MyList<>();
        MyList<BookRequest> bookRequestList = new MyList<>();

        /*Đọc dữ liệu từ Member*/
        if (!memberList.isFileEmty(fileMember)) {
            memberList.clear();
            memberList.readFileMember(fileMember, memberList);
        } else {
            System.out.println("Null");
        }

        /*Đọc dữ liệu từ Librarian*/
        if (!librarianList.isFileEmty(fileLibrarian)) {
            librarianList.clear();
            librarianList.readFileLibrarian(fileLibrarian, librarianList);
        } else {
            System.out.println("Null");
        }

        /*Đọc dữ liệu từ Book*/
        if (!bookList.isFileEmty(fileBook)) {
            bookList.clear();
            bookList.readFileBook(fileBook, bookList);
        } else {
            System.out.println("Null");
        }

        boolean flag = true;
        boolean check = true;                                                   //(true: member, false: librarian)

        /*Đăng nhập*/
        System.out.println("Log in!");

        /*Nhập sai cho nhập lại*/
        while (flag) {
            System.out.println("Input your ID");                              // Cho nhập ID trước
            String dataID = sc.nextLine();                                      // Kiểm tra tên trùng với ID
            if (memberList.compare(dataID)) {
                System.out.println("Input your Name");
                String dataName = sc.nextLine();
                if (memberList.compare(dataName)) {
                    flag = false;
                    check = true;                  
                    System.out.println("Member");
                } else {
                    System.out.println("Your name or your id is wrong");
                    flag = true;
                }
            } else if (librarianList.compare(dataID)) {
                System.out.println("Input your Name");
                String dataName = sc.nextLine();
                if (librarianList.compare(dataName)) {
                    flag = false;
                    check = false;
                    System.out.println("Librarian");
                } else {
                    System.out.println("Your name or your id is wrong");
                    flag = true;
                }
            }
        }

        if (!check) {
            librarianMenu();
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            switch (choice) {
                //Librarian search book for title or id
                case 1 -> {
                    System.out.println("Input book's title or id ");
                    String data = sc.next();
                    var result = bookList.search(data).getInfo();
                    if (result != null) {
                        System.out.println(result);
                    } else {
                        System.out.println("Couldn't find or be borrowed");
                    }
                }

                case 2 -> {
                    System.out.println("Input member's name or id ");
                    String data = sc.next();
                    var result = memberList.search(data).getInfo();
                    if (result != null) {
                        System.out.println(result);
                    } else {
                        System.out.println("Couldn't find");
                    }
                }
                default ->
                    throw new AssertionError();
            }
        } else {
            boolean checkAns = true;
            while (checkAns) {
                memberMenu();
                System.out.print("Choose: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Input book's title or id ");
                        String data = sc.next();
                        var result = bookList.search(data).getInfo();
                        if (result != null) {
                            System.out.println(result);
                        } else {
                            System.out.println("Couldn't find or be borrowed");
                        }
                        System.out.println("Want to borrow book or find more book ?");
                        System.out.println("1/ Yes");
                        System.out.println("2/ No");
                        int ans = sc.nextInt();
                        switch (ans) {
                            case 1 ->
                                checkAns = true;

                            case 2 ->
                                checkAns = false;

                            default ->
                                throw new AssertionError();
                        }
                    }

                    case 2 -> {
                        bookRequestList.borrowBook(bookRequestList, bookList);
//                        Book newBook = new Book(bookDelete);
//                        bookList.deleteNode(newBook);

                        
                        bookList.showList();
                        System.out.println("Want to borrow book or find more book ?");
                        System.out.println("1/ Yes");
                        System.out.println("2/ No");
                        int ans = sc.nextInt();
                        switch (ans) {
                            case 1 ->
                                checkAns = true;

                            case 2 ->
                                checkAns = false;
                        }
                    }

                    default ->
                        throw new AssertionError();
                }
            }
        }
        
        memberList.writeFile(fileMember, memberList);
        librarianList.writeFile(fileLibrarian, librarianList);
        bookList.writeFile(fileBook, bookList);
        bookRequestList.writeFile(fileBookRequest, bookRequestList);

    }

}
