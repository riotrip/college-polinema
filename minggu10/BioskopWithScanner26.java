package minggu10;

import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = scan.nextLine();
            System.out.print("Masukkan baris: ");
            baris = scan.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = scan.nextInt();
            scan.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = scan.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
