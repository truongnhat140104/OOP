import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean c = true;
        while (c){
            System.out.println("1. Tinh gia dat");
            System.out.println("2. Tinh gia nha");
            System.out.println("3. Tinh gia khach san");
            System.out.println("4. Tinh gia biet thu");
            System.out.println("5. Thoat");
            System.out.print("Vui long nhap lua chon: ");
            int x = scanner.nextInt();
            if (x == 1) {
                luachon1();
            }
            if (x == 2) {
                luachon2();
            }
            if (x == 3) {
                luachon3();
            }
            if (x == 4) {
                luachon4();
            }
            if (x == 5){
                c = false;
            }
        }
}
    public static void luachon1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap id: "); int id = scanner.nextInt();
        System.out.print("nhap chieu dai: "); double length = scanner.nextDouble();
        System.out.print("nhap chieu rong: "); double width = scanner.nextDouble();
        Dat dat = new Dat (id,length,width);
        System.out.println("gia dat: " + (long) dat.calculatePrice());
    }
    public static void luachon2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap id: "); int id = scanner.nextInt();
        System.out.print("nhap chieu dai: "); double length = scanner.nextDouble();
        System.out.print("nhap chieu rong: "); double width = scanner.nextDouble();
        System.out.print("nhap so tang: "); int floors = scanner.nextInt();
        Nha nha = new Nha (id,length,width,floors);
        System.out.println("gia nha: " + (long) nha.calculatePrice());
    }
    public static void luachon3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap id: "); int id = scanner.nextInt();
        System.out.print("nhap chieu dai: "); double length = scanner.nextDouble();
        System.out.print("nhap chieu rong: "); double width = scanner.nextDouble();
        System.out.print("nhap so so sao: "); int stars = scanner.nextInt();
        KhachSan khachSan= new KhachSan(id,length,width,stars);
        System.out.println("Phi kinh doanh: " + (long) khachSan.Price(khachSan.getWidth()));
        System.out.println("Gia khach san + phi kinh doanh: " + (long) khachSan.calculatePrice() + (long) khachSan.Price(khachSan.getWidth()));
    }
    public static void luachon4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap id: "); int id = scanner.nextInt();
        System.out.print("nhap chieu dai: "); double length = scanner.nextDouble();
        System.out.print("nhap chieu rong: "); double width = scanner.nextDouble();
        BietThu bietThu= new BietThu(id,length,width);
        System.out.println("Phi kinh doanh: " + (long) bietThu.Price(bietThu.getWidth()));
        System.out.println("Gia khach san + phi kinh doanh: " + (long) bietThu.calculatePrice() + (long) bietThu.Price(bietThu.getWidth()));
    }

}
