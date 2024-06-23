package minggu14;

import java.util.Scanner;

public class PenjumlahanRekursif26 {
    static int penjumlah(int n) {
        if (n == 0) {
            return (0);
        } else {
            return (n + penjumlah(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int N = scan.nextInt();
        for (int i = 1; i < N; i++) {
            System.out.print(i + " + ");
        }
        System.out.print(N + " = " + penjumlah(N));
    }
}
