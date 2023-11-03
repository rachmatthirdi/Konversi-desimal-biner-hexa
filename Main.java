package Konversi;
import java.util.*;
/*
 * Rachmat Thirdi Maliki
 * 235150200111032
 * TIF-C
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int desimal;String biner, hexa;
        for(int i=0;i<2;--i){
            System.out.print("Pilihan Konversi Awal\n1.Desimal\n2.Biner\n3.Hexa\nMasukkan Bilangan yang Akan Dikonversikan : ");
            int  pilihan=input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka desimal: ");
                    desimal = input.nextInt();
                    biner = Integer.toBinaryString(desimal);
                    hexa = Integer.toHexString(desimal);
                    System.out.println("Biner: " + biner);
                    System.out.println("Hexa: " + hexa);
                    break;
                case 2:
                    System.out.print("Masukkan angka biner: ");
                    biner = input.next();
                    desimal= Integer.parseInt(biner, 2);
                    hexa = Integer.toHexString(desimal);
                    System.out.println("Desimal: " + desimal);
                    System.out.println("Hexa: " + hexa);
                    break;
                case 3:
                    System.out.print("Masukkan angka hexa: ");
                    hexa = input.next();
                    desimal = Integer.parseInt(hexa, 16);
                    biner = Integer.toBinaryString(desimal);
                    System.out.println("Desimal: " + desimal);
                    System.out.println("Biner: " + biner);
                break;
                default:
                System.out.println("Coba Lagi");
            }
        }
        input.close();
    }
    
}
