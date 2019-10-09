package pbo;
import java.util.Scanner;
public class ngitunglpbola {
    public static void main(String[] args) {
        System.out.println("Menghitung Luas Permukaan BOLA \n==============================");
        System.out.print("Masukkan Jari jari nya : ");
        Scanner input = new Scanner (System.in);
        double jari = input.nextDouble();
        System.out.println("==============================");
        System.out.println("Luas Permukaan BOLA adalah : "+(jari*jari*22/7*4));
    }
}
