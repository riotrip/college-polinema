package minggu14;

import java.util.Scanner;

public class DeretDescendingRekursif26 {
    static int descRekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            System.out.print(n + " ");
            return (descRekursif(n - 1));
        }
    }

    static int descIteratif(int n) {
        int descend = 0;
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
            descend = i;
        }
        return descend;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int N = scan.nextInt();
        System.out.println("Fungsi Rekursif: ");
        descRekursif(N);
        System.out.println();
        System.out.println("Fungsi Iteratif: ");
        descIteratif(N);
    }
}
