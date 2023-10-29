package minggu9;

import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = scan.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double rataLulus, rataTdkLulus, totLulus = 0, totTdkLulus = 0;
        int countLulus = 0, countTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = scan.nextInt();
            if (nilaiMhs[i] > 70) {
                totLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totTdkLulus += nilaiMhs[i];
                countTdkLulus++;
            }
        }
        rataLulus = totLulus / countLulus;
        rataTdkLulus = totTdkLulus / countTdkLulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
    }
}
