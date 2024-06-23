package minggu8;

import java.util.Scanner;

public class utsSoal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bil, ganjil = 0, digit;

        System.out.println("Masukkan bilangan: ");
        bil = scan.nextInt();
        
        while (bil > 0) {
            digit = bil % 10;
            if (digit % 2 != 0) {
                ganjil++;
            }
            bil /= 10;
        }
        System.out.println("Jumlah digit ganjil: " + ganjil);
    }
}
