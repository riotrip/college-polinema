package minggu7;

import java.util.Scanner;

public class WhileKelipatan26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, total = 0, counter = 0;

        System.out.print("Masukkan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++;
        }

        System.out.printf("Banyaknya bilangan %d dari 1-50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan %d dari 1-50 adalah %d\n", kelipatan, total);
        double rata2 = (double) total / counter;
        System.out.println("Rata-rata = " + rata2);
    }
}
