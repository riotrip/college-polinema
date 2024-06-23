package minggu8;

import java.util.Scanner;

public class utsSoal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bil, total = 0;

        System.out.println("Masukkan bilangan: ");
        bil = scan.nextInt();
        if (bil > 0) {
            for (int i = 1; i <= bil; i++) {
                total += i * i;
            }
            System.out.println("Total penjumlahan kuadrat bilangan adalah " + total);
        } else {
            System.out.println("Bilangan harus lebih dari 0");
        }
    }
}