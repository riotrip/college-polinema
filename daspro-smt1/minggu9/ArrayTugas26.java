package minggu9;

import java.util.Scanner;

public class ArrayTugas26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah bilangan : ");
        int jmlBil = scan.nextInt();

        int[] bil = new int[jmlBil];
        double rata2;
        int total = 0;

        for (int i = 0; i < bil.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            bil[i] = scan.nextInt();
        }
        
        int nilTinggi = bil[0], nilRendah = bil[0];

        for (int i = 0; i < bil.length; i++) {
            if (bil[i] > nilTinggi) {
                nilTinggi = bil[i];
            }
            if (bil[i] < nilRendah) {
                nilRendah = bil[i];
            }
            total += bil[i];
        }
        rata2 = (double) total / jmlBil;
        System.out.println("Nilai tertinggi : " + nilTinggi);
        System.out.println("Nilai terendah : " + nilRendah);
        System.out.println("Rata-rata : " + rata2);
    }
}
