package minggu11;

import java.util.Scanner;

public class TriangleReverse26 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            int space = N - i;
            for (int k = 0; k <= space; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
