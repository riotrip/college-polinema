package minggu5;

import java.util.Scanner;

public class MainSum26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Program menghitung Keuntungan Total");
        System.out.print("Masukkan jumlah bulan :");
        int elm = scan.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("===========================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan keuntungan bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = scan.nextDouble();
        }

        System.out.println("==============================================================");
        System.out.println("ALGORITMA BRUCE FORCE");
        System.out.println(
                "Total Keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
        System.out.println("==============================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah "
                + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        System.out.println("==============================================================");
    }

}