import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong dan muon ban: ");
        List<String> info = new ArrayList<>();
        GunFirst gunFi= new GunFirst();
        GunFirst gunSe= new GunFirst();
        int n = scanner.nextInt();
        while (n--!=0){
            System.out.println("nhap loai dan muon ban");
            System.out.println("1. dan APDS: 105mm");
            System.out.println("2. dan HE: 120mm");
            int dan = scanner.nextInt();
            if (dan == 1){
                if (checkGunFirst(gunFi,105)) gunFi.FireControlSystem();

            }
        }
    }
    public static boolean checkGunFirst(GunFirst gun,int round){
        if (gun.getAPDS()==round) return true;
        return false;
    }
    public static boolean checkGunSec(GunSecond gun,int round){
        if ((gun.getAPDS()==round)||(gun.getHE()==round)) return true;
        return false;
    }
}