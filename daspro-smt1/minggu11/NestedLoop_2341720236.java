package minggu11;

import java.util.Scanner;

public class NestedLoop_2341720236 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] array = new double[5][7];
        double[] rata2 = new double[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                array[i][j] = scan.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < rata2.length; i++) {
            rata2[i] /= 7;
        }

        int k = 1;
        for (double[] kota : array) {
            System.out.println("Kota ke-" + k);
            for (double hari : kota) {
                System.out.println(hari + " ");
            }
            System.out.println();
            k++;
        }

        for (int i = 0; i < rata2.length; i++) {
            System.out.println("Rata-rata kota ke-" + (i + 1) + ":" + rata2[i]);
        }
    }
}
