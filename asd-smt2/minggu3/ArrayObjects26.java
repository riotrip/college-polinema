package minggu3;

import java.util.Scanner;

public class ArrayObjects26 {
    public static void main(String[] args) {
        PersegiPanjang ppArray[][] = new PersegiPanjang[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ppArray[i][j] = new PersegiPanjang();
                ppArray[i][j].lebar = i + 2;
                ppArray[i][j].panjang = i + 3;
            }
        }
        System.out.println("panjag");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ppArray[i][j] = new PersegiPanjang();
                System.out.println(ppArray[i][j].panjang + " ");
            }
            System.out.println(" ");
        }
        System.out.println("lebar");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ppArray[i][j] = new PersegiPanjang();
                System.out.println(ppArray[i][j].lebar + " ");
            }
            System.out.println(" ");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyak persegi panjang yang dimiliki: ");
        int n = scan.nextInt();
        // PersegiPanjang[] ppArray = new PersegiPanjang[n];

        // for (int i = 0; i < ppArray.length; i++) {
        // ppArray[i] = new PersegiPanjang();
        // System.out.println("Persegi panjang ke-" + i);
        // System.out.print("Masukkan panjang: ");
        // ppArray[i].panjang = scan.nextInt();
        // System.out.print("Masukkan lebar: ");
        // ppArray[i].lebar = scan.nextInt();
        // }

        // for (int i = 0; i < ppArray.length; i++) {
        // System.out.println("Persegi panjang ke-" + i);
        // System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " +
        // ppArray[i].lebar);
        // }
    }
}