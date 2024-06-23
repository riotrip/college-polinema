package minggu4;

import java.util.Scanner;

public class Gaji26 {
    public static void main(String[] args) {   
        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Besar Gaji: ");
        gaji = input.nextInt();
        System.out.print("Masukkan Besar Potongan Gaji: ");
        potGaji = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Masuk Anda: ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Anda: ");
        JmlTdkMasuk = input.nextInt();

        TotGaji = (jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        
        System.out.println("Gaji yang diterima adalah " + TotGaji);
    }
}