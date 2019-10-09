package pbo;
import java.util.Scanner;
public class ngitunglpbalok {
    public static void main(String[] args) {
        System.out.println("Menghitung Luas Permukaan BALOK \n===============================");
        System.out.print("Masukkan Panjang : ");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        System.out.print("Masukkan Lebar   : ");
        int l = input.nextInt();
        System.out.print("Masukkan Tinggi  : ");
        int t = input.nextInt();
        System.out.println("===============================");
        System.out.println("Luas Permukaan BALOK adalah : "+((2*p*l)+(2*p*t)+(2*l*t)));
    }
}
