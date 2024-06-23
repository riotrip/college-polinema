package minggu11;

import java.util.Random;
import java.util.Scanner;

public class Quiz26 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        char menu = 'y';

        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = scan.nextInt();
                scan.nextLine();
                success = (answer == number);
                if (answer < number) {
                    System.out.println("Nilai input lebih kecil dari jawaban");
                } else if (answer > number) {
                    System.out.println("Nilai input lebih besar dari jawaban");
                }
            } while (!success);
            System.out.println("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = scan.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');

    }
}
