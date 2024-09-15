import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Catalog {
    // (Các trường và phương thức của lớp Catalog)
    private String ISBN;
    private String title;
    private  String authors;
    private int year;
    private String publisher;
    private String status;

    public Catalog(String title, String ISBN, String authors, int year, String publisher, String status) {
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

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getStatus() {
        return status;
    }
}
class Account {
    // (Các trường và phương thức của lớp Account)
    private String accountID;
    private char accountType;
    private String fullname;
    private String dateOfBirth;
    private String phone;
    private String email;
    private String address;
    private String status;

    public Account(String accountID, char accountType, String fullname, String dateOfBirth, String phone, String email, String address, String status) {
        this.accountID = accountID;
        this.accountType = accountType;
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.status = status;
    }
    public Account(){
        //
    }

    public String getAccountID() {
        return accountID;
    }

    public char getAccountType() {
        return accountType;
    }

    public String getFullname() {
        return fullname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }
}
class BookRequest {
    // (Các trường và phương thức của lớp BookRequest)
    private String BLcode;
    private String memberId;
    private String ISBN;
    private String dueDate;
    private String returnDate;

    public BookRequest(String BLcode, String memberId, String ISBN, String dueDate, String returnDate) {
        this.BLcode = BLcode;
        this.dueDate = dueDate;
        this.memberId = memberId;
        this.returnDate = returnDate;
        this.ISBN = ISBN;
    }

    public String getBLcode() {
        return BLcode;
    }

    public void setBLcode(String BLcode) {
        this.BLcode = BLcode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}

class LibrarianAccount extends Account {
    // (Các trường và phương thức của lớp LibrarianAccount)
    private String startingDate;
    private String maritalStatus;

    public LibrarianAccount(String accountID, char accountType, String fullname, String dateOfBirth, String phone, String email, String address, String status, String startingDate, String maritalStatus) {
        super(accountID, accountType, fullname, dateOfBirth, phone, email, address, status);
        this.startingDate = startingDate;
        this.maritalStatus = maritalStatus;
    }
    public LibrarianAccount(){
        //
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void findingCatalog(List<Catalog> book){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Tìm kiếm sách:");
            System.out.println("1. Tìm kiếm theo tựa");
            System.out.println("2. Tìm kiếm theo mã số sách");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int x=scanner.nextInt();
            scanner.nextLine();

            if (x==1){
                System.out.print("nhập tựa sách cần tìm: ");
                String s = scanner.nextLine();
                boolean c = false;

                for (Catalog b : book){
                    if (b.getTitle().equals(s)){
                        System.out.println("Tên: "+b.getTitle()+", mã số sách: "+b.getISBN()+"\n");
                        c=true;
                        break;
                    }
                }
                if (!c) System.out.println("Không tìm thấy sách. Xin thử lại\n");

            }
            if (x==2){
                System.out.print("Nhập mã số sách cần tìm: ");
                String s = scanner.nextLine();
                boolean c = false;
                for (Catalog b : book){
                    if (b.getISBN().equals(s)){
                        System.out.println("Tên: "+b.getTitle()+", mã số sách: "+b.getISBN()+"\n");
                        c=true;
                        break;
                    }
                }
                if (!c) System.out.println("Không tìm thấy sách. Xin thử lại\n");
            }
            if (x==3) break;
        }

    }
    public void findingInfoMemberAccount(List <MemberAccount> accountsMember){
        boolean b = true;
        while (b){
            Scanner scanner = new Scanner(System.in);


            System.out.println("Tìm kiếm thành viên");
            System.out.println("1. Tìm kiếm theo tên");
            System.out.println("2. tim kiem theo ma so thanh vien");
            System.out.println("3. thoat");
            System.out.print("Nhập lựa chọn: ");

            int x=scanner.nextInt();
            scanner.nextLine();

            if (x==1){
                System.out.print("nhập tên thành viên cần tìm kiếm: ");
                String s = scanner.nextLine();
                boolean c = false;
                for (MemberAccount aM : accountsMember){
                    if (aM.getFullname().equals(s)) {
                        System.out.println("Tên: "+ aM.getFullname()+ ", mã số thành viên: "+aM.getAccountID());
                        c = true;
                        break;
                    }
                }
                if (!c) System.out.println("Không tìm thấy. Xin thử lại\n");

            }
            if (x==2){
                System.out.print("nhập mã số thành viên cần tìm: ");
                String s = scanner.nextLine();
                boolean c = false;

                for (MemberAccount aM : accountsMember){
                    if (aM.getAccountID().equals(s)) {
                        System.out.println("Tên: "+ aM.getFullname()+ ", mã số thành viên: "+aM.getAccountID());
                        c = true;
                        break;
                    }
                }
                if (!c) System.out.println("Không tìm thấy sách. Xin thử lại\n");
            }
            if (x==3) break;
        }
    }
    public void findingBookRequest(List<Catalog> catalogList, List<MemberAccount> memberAccounts) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b) {

            System.out.println("Tìm kiếm phiếu mượn sách");
            System.out.println("1. Tìm theo mã số sách");
            System.out.println("2. Tìm theo mã số thành viên");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int x = scanner.nextInt();
            scanner.nextLine();

            if (x == 1) {
                System.out.print("Nhập mã số sách: ");
                String s = scanner.nextLine();
                boolean c = false;

                for (Catalog ca : catalogList){
                    if (ca.getISBN().equals(s)) {
                        System.out.println("kết quả: ");
                        System.out.println("tác giả: "+ca.getTitle()+", trạng thái sách: "+ca.getStatus());
                        c = true;
                        b = false;
                        break;
                    }
                }
                if (!c) System.out.println("Không tìm thấy sách. Xin thử lại\n");
            }
            if (x == 2) {
                System.out.print("Nhập mã số thành viên: ");
                String s = scanner.nextLine();
                boolean c = false;

                for (MemberAccount mAc : memberAccounts){
                    if (mAc.getAccountID().equals(s)) {
                        System.out.println("kết quả: ");
                        System.out.println("Tên: "+mAc.getFullname()+", số lượng sách đã mượn: "+mAc.getnBooks());
                        c = true;
                        b = false;
                        break;
                    }
                }
                if (!c) System.out.println("Không tìm thấy sách. Xin thử lại\n");
            }
            if (x == 3) break;
        }
    }
}

class MemberAccount extends Account{
    // (Các trường và phương thức của lớp MemberAccount)
    private String membershipDate;
    private int nBooks;
    public MemberAccount(String accountID, char accountType, String fullname, String dateOfBirth, String phone, String email, String address, String status, String membershipDate, int nBooks){
        super(accountID, accountType, fullname, dateOfBirth, phone, email, address, status);
        this.membershipDate=membershipDate;
        this.nBooks = nBooks;
    }
    public MemberAccount(){ }
    public int getnBooks(){
        return this.nBooks;
    }

    public String getMembershipDate() {
        return membershipDate;
    }

    public void findingBook(List<Catalog> catalogList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm kiếm sách");
        System.out.println("1. Tìm kiếm theo tựa sách");
        System.out.println("2. Tìm kiếm theo mã số sách");
        System.out.println("3. Tìm kiếm theo tác giả");
        System.out.println("4. Tìm kiếm theo nhà xuất bản");
        System.out.println("4. Thoát");
        System.out.print("Nhập lựa chọn: ");

        int x=scanner.nextInt();
        scanner.nextLine();
        boolean b = true;

        while (b){
            if (x==1){
                System.out.print("Nhập tên tựa sách cần tìm: ");
                String s = scanner.nextLine();
                boolean c = false;

                for (Catalog book : catalogList){
                    if (book.getTitle().equals(s)) {
                        System.out.println("da tim thay sach: " + book.getTitle()+", mã số sách: "+book.getISBN());
                        c = true;
                        b = false;
                        break;
                    }
                }
                if (!c) System.out.println("Không tìm thấy sách. Xin thử lại\n");
            }
            if (x==2){
                System.out.print("Nhập mã số sách cần tìm: ");
                String s = scanner.nextLine();
                boolean c = false;

                for (Catalog book : catalogList){
                    if (book.getTitle().equals(s)) {
                        System.out.println("Tìm thấy sách: " + book.getTitle()+", mã số sách: "+book.getISBN());
                        c = true;
                        b = false;
                        break;
                    }
                }
                if (!c) System.out.println("Không tìm thấy sách. Xin thử lại\n");
            }
            if (x==3){
                System.out.print("Nhập tên tác giả để tìm sách: ");
                String s = scanner.nextLine();
                System.out.println("Danh sách các tựa sách tìm được theo tên tác giả");

                for (Catalog catalog : catalogList){
                    if (catalog.getAuthors().equals(s)) {
                        System.out.println(catalog.getTitle());
                        b = false;
                    }
                }
                break;
            }
            if (x==4) break;
        }
    }
    public void signingBookRequest(List<Catalog> books){
        System.out.println("Nhập thông tin trước khi mượn sách");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mã số phiếu mượn: ");
        String BLcode = scanner.nextLine();
        System.out.print("Mã số thành viên: ");
        String memberID = scanner.nextLine();
        System.out.print("Ngày đến hạn: ");
        String dueDate = scanner.nextLine();
        System.out.print("Ngày trả sách: ");
        String returnDate = scanner.nextLine();
        System.out.print("Nhập mã số sách cần mượn: ");
        String ISBN = scanner.nextLine();

        boolean bool = true;
        int dem = 1;
        while (bool){
            if (dem > 1){
                System.out.println("Do nhập sai mã số hoặc sách đã được mượn, xin vui lòng chọn: ");
                System.out.println("1. Nhập lại mã số sách ");
                System.out.println("2. Thoát ");
                System.out.print("Nhập lựa chọn: ");

                int luachon = scanner.nextInt();
                scanner.nextLine();
                if (luachon==1){
                    String ISBN1 = scanner.nextLine();
                    BookRequest bQuest= new BookRequest(BLcode,memberID,ISBN1,dueDate,returnDate);

                    boolean c = false;

                    for (Catalog b : books){
                        if (b.getStatus().equals("available") && b.getISBN().equals(bQuest.getISBN())) {
                            System.out.println("Đăng kí mượn sách thành công");
                            c = true;
                            bool = false;
                            break;
                        }
                    }
                    if (!c) {
                        System.out.println("Đăng kí không thành công do nhập sai mã số sách hoặc sách đã được mượn");
                        System.out.println("Xin vui lòng thử lại");
                    }
                }
                if (luachon == 2) {
                    break;
                }
            }
            if (dem == 1){
                BookRequest bQuest= new BookRequest(BLcode,memberID,ISBN,dueDate,returnDate);

                boolean c = false;

                for (Catalog b : books){
                    if (b.getStatus().equals("available") && b.getISBN().equals(bQuest.getISBN())) {
                        System.out.println("Đăng kí mượn sách thành công");
                        c = true;
                        bool = false;
                        break;
                    }
                }
                if (!c) {
                    System.out.println("Đăng kí không thành công do nhập sai mã số sách hoặc sách đã được mượn");
                    System.out.println("Xin vui lòng thử lại");
                    dem++;
                }
            }
        }
    }
}
public class LibraryManagementSyste+m {
    public static void main(String[] args) {
        // Khởi tạo danh sách các cuốn sách trong danh mục sách
//        System.out.println("Thông tin các cuốn sách trong danh mục sách\n");
        List<Catalog> books = new ArrayList<>();
        // Thêm các cuốn sách vào danh sách
        books.add(new Catalog("To Kill a Mockingbird", "978-0-06-112008-4", "Harper Lee", 1960, "J. B. Lippincott & Co.","available"));
        books.add(new Catalog("The Great Gatsby", "978-0-7432-7356-5", "F. Scott Fitzgerald", 1925, "Charles Scribner's Sons","loaned"));
        books.add(new Catalog("1984", "978-0-452-28423-4", "George Orwell", 1949, "Secker & Warburg","loaned"));
        books.add(new Catalog("The Catcher in the Rye", "978-0-316-76948-0", "J.D. Salinger", 1951, "Little Brown and Company","available"));
        books.add(new Catalog("Harry Potter and the Sorcerer's Stone", "978-0-7475-3269-6", "J.K. Rowling", 1997, "Bloomsbury Publishing","loaned"));
        books.add(new Catalog("The Hobbit", "978-0-261-10211-0", "J.R.R. Tolkien", 1937, "George Allen & Unwin","available"));

        // In ra thông tin sách trong danh mục
        /*for (Catalog catalog : books) {
            System.out.println("Thông tin sách:");
            System.out.println("Tựa sách: " + catalog.getTitle());
            System.out.println("ISBN: " + catalog.getISBN());
            System.out.println("Tác giả: " + catalog.getAuthors());
            System.out.println("Năm xuất bản: " + catalog.getYear());
            System.out.println("Nhà xuất bản: " + catalog.getPublisher());
            System.out.println("Tình trạng: " + catalog.getStatus());
            System.out.println();
        }*/

        // Khởi tạo danh sách tài khoản quản lý thư viện và tài khoản thành viên
//        System.out.println("Một số tài khoản quản lý thư viện dùng để đăng nhập: ");
        List<LibrarianAccount> accountLib = new ArrayList<>();
        // Thêm các tài khoản quản lý thư viện vào danh sách
        accountLib.add(new LibrarianAccount("1221",'L',"Nguyen Thanh An","19-9-2004","034123492","nguyenthanhan199@gmail.com","HCM","active","19-9-2020","single"));
        accountLib.add(new LibrarianAccount("1225",'L',"Doãn Chí Bình","13-9-2004","034931649","doanchibinh139@gmail.com","HCM","active","19-8-2021","single"));
        accountLib.add(new LibrarianAccount("1226",'L',"Lý Trung Bình","14-6-2004","0316943213","lytrungbinh146@gmail.com","Da Nang","closed","12-9-2021","divorced"));

        // In ra thông tin tài khoản quản lý thư viện
       /* for (LibrarianAccount account : accountLib) {
            System.out.println("Mã số tài khoản: " + account.getAccountID());
            System.out.println("Loại tài khoản: " + account.getAccountType());
            System.out.println("Họ tên: " + account.getFullname());
            System.out.println("Ngày tháng năm sinh: " + account.getDateOfBirth());
            System.out.println("Số điện thoại: " + account.getPhone());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Địa chỉ: " + account.getAddress());
            System.out.println("Tình trạng tài khoản: " + account.getStatus());
            System.out.println("Ngày bắt đầu làm việc: " + account.getStartingDate());
            System.out.println("Tình trạng hôn nhân: " + account.getMaritalStatus());
            System.out.println();
        }*/

        // Khởi tạo danh sách tài khoản thành viên
//        System.out.println("Một số tài Member dùng để đăng nhập: ");
        List<MemberAccount> accountsMember = new ArrayList<>();

        // Thêm các tài khoản thành viên vào danh sách
        accountsMember.add(new MemberAccount("1222",'M',"Nguyen Nhat Hai","31-5-2001","076512315","nguyennhathai315@gmail.com","DaNang","active","18-2-2021",1));
        accountsMember.add(new MemberAccount("1223",'M',"Nguyen Thanh Thai","18-7-1999","0941231564","nguyenthanhthai187@gmail.com","HCM","suspended","23-2-2020",3));
        accountsMember.add(new MemberAccount("1224",'M',"Nguyen Chí Thanh","21-6-2003","065913231","nguyenchithanh216@gmail.com","Ha Noi","active","20-6-2019",0));
        accountsMember.add(new MemberAccount("1227",'m',"Lý Thị Diệu","11-9-2004","0413649872","nguyenthidieu119@gmail.com","Ha Noi","closed","23-1-2020",4));

        // (In ra thông tin tài khoản thành viên)
        /*for (MemberAccount account : accountsMember) {
            System.out.println("Mã số tài khoản: " + account.getAccountID());
            System.out.println("Loại tài khoản: " + account.getAccountType());
            System.out.println("Họ tên: " + account.getFullname());
            System.out.println("Ngày tháng năm sinh: " + account.getDateOfBirth());
            System.out.println("Số điện thoại: " + account.getPhone());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Địa chỉ: " + account.getAddress());
            System.out.println("Tình trạng tài khoản: " + account.getStatus());
            System.out.println("Ngày tham gia thư viện: " + account.getMembershipDate());
            System.out.println("Số sách đã mượn: " + account.getnBooks());
            System.out.println();
        }*/

        Scanner scanner = new Scanner(System.in);

        while (true){
            // Hiển thị menu cho người dùng chọn tài khoản
            System.out.println("Chọn cách truy cập tài khoản:");
            System.out.println("1. Librarian Account");
            System.out.println("2. Member Account");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int luachon = scanner.nextInt();
            scanner.nextLine();

            // Xử lý tài khoản thành viên
            if (luachon==1) {
                System.out.println("Đang đăng nhập bằng tài khoản: Librarian Account");
                System.out.print("Vui lòng nhập Account ID: ");
                String account_ID = scanner.nextLine();
                if (checkLibAccount(accountLib, account_ID)) {

                    System.out.println("Xin chọn chức năng: ");
                    System.out.println("1. Tìm kiếm sách trong danh mục sách, theo tựa hoặc mã số sách");
                    System.out.println("2. Tìm kiếm thông tin trong danh sách các tài khoản thành viên, theo tên hoặc mã số thành viên");
                    System.out.println("3. Tìm kiếm trong danh sách các phiếu mượn sách, theo mã số sách hoặc mã số thành viên");
                    System.out.println("4. Thoát");
                    System.out.print("Nhập lựa chọn: ");

                    LibrarianAccount accLib = new LibrarianAccount();
                    int selectLib = scanner.nextInt();
                    scanner.nextLine();

                    // Tìm kiếm thông tin
                    while (true) {
                        // Tìm kiếm sách trong danh mục sách, theo tựa hoặc mã số sách
                        if (selectLib == 1) {
                            accLib.findingCatalog(books);
                            break;
                        }
                        //Tìm kiếm thông tin trong danh sách các tài khoản thành viên, theo tên hoặc mã số thành viên
                        if (selectLib == 2) {
                            accLib.findingInfoMemberAccount(accountsMember);
                            break;
                        }
                        //Tìm kiếm trong danh sách các phiếu mượn sách, theo mã số sách hoặc mã số thành viên
                        if (selectLib == 3) {
                            accLib.findingBookRequest(books, accountsMember);
                            break;
                        }
                        //Thoát
                        if (selectLib == 4) break;
                    }
                }
                else System.out.println("Tài khoản không tồn tại hoặc đã hết hạn xin thử lại\n");

            }
            // Xử lý tài khoản thành viên
            if (luachon == 2){
                System.out.println("Đang đăng nhập bằng tài khoản: Member Account");
                System.out.print("Vui lòng nhập Account ID: ");
                String account_ID1 = scanner.nextLine();

                if (checkMemberAccount(accountsMember,account_ID1)){
                    System.out.println("Xin chọn chức năng: ");
                    System.out.println("1. Tìm kiếm sách ");
                    System.out.println("2. Đăng kí mượn sách");
                    System.out.println("3. Thoát");
                    System.out.print("Nhập lựa chọn: ");

                    int selectMember = scanner.nextInt();
                    scanner.nextLine();
                    MemberAccount memberAccount = new MemberAccount();

                    //Tìm kiếm
                    while(true){
                        if (selectMember == 1){
                            memberAccount.findingBook(books);
                            break;
                        }

                        if (selectMember == 2){
                            memberAccount.signingBookRequest(books);
                            break;
                        }

                        if (selectMember == 3) break;

                    }
                }
                else System.out.println("tài khoản không tồn tại hoặc đã hết hạn xin thử lại \n");
            }
            // Xử lý tài khoản thành viên
            if (luachon == 3) break;
        }
    }
    // Hàm kiểm tra tài khoản quản lý thư viện
    public static boolean checkLibAccount(List<LibrarianAccount> ac,String s){
        for (Account account : ac){
            if(account.getAccountID().equals(s) && account.getStatus().equals("active")) return true;
        }
        return false;
    }
    // Hàm kiểm tra tài khoản thành viên
    public static boolean checkMemberAccount(List<MemberAccount> ac,String s){
        for (Account account : ac){
            if(account.getAccountID().equals(s) && account.getStatus().equals("active")) return true;
        }
        return false;
    }
}
/*
Hướng dẫn sử dụng Library Management System

1. Các thông tin sách, tài khoản dùng để đăng nhập - Member và Librarian - được lưu trong folder "Account&Catalog"
2. Để đăng nhập thành công:
	- Với mỗi tài khoản đều có "loại tài khoản" ứng với (M: member account; L: librarian account). Xin nhập đúng loại tài khoản.
	- Tài khoản có trạng thái (status) "active"
	- Đúng tên đăng nhập (tên đăng nhập là AccountID của tài khoản)

*Một số lưu ý:
- Không tìm thấy sách: chỉ có những cuốn sách trong file "Catalog.txt" ở trong folder "Account&Catalog" mới có thể tìm thấy được.
- Không đăng kí mượn thành công: chỉ có những cuốn sách trong file "Catalog.txt" ở trong folder "Account&Catalog" và tình trạng sách phải là "available" mới có thể đăng kí mượn được.
- Không tìm thấy thành viên: chỉ có những tài khoản trong file "MemberAccount.txt" ở trong folder "Account&Catalog" mới có thể tìm thấy.
- Vì các giá trị đã được lưu trong code ở file "LibraryManagementSystem.java" nên thay đổi giá trị trong folder "Account&Catalog" sẽ không làm thay đổi giá trị kết quả.
Xin không thay đổi các file trong folder "Account&Catalog" để tránh quên khi sử dụng.
*/
