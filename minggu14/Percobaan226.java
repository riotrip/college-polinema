package minggu14;

import java.util.Scanner;

public class Percobaan226 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print(1 + " = ");
            return (1);
        } else {
            System.out.print(x + "x");
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = scan.nextInt();
        System.out.print("Pangkat: ");
        pangkat = scan.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
