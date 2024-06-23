package minggu14;

import java.util.Scanner;

public class CekPrimaRekursif26 {
    static boolean cekPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int N = scan.nextInt();

        System.out.print(cekPrima(N) ? "Prima" : "Bukan");

    }
}
