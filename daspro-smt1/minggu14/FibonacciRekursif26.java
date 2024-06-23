package minggu14;

import java.util.Scanner;

public class FibonacciRekursif26 {
    static int pasanganMarmut(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return pasanganMarmut(n - 1) + pasanganMarmut(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int N = scan.nextInt();

        System.out.print("Jumlah pasangan marmut adalah: ");
        System.out.println(pasanganMarmut(N));
    }
}
