package minggu10;

import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int baris, kolom, pilihan;
        String nama, next;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("\nPilih Menu:");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Data Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu dalam (1/2/3): ");
            pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    boolean lanjut = true;
                    while (lanjut) {
                        scan.nextLine();
                        System.out.print("Masukkan nama: ");
                        nama = scan.nextLine();
                        boolean kursi = false;
                        while (!kursi) {
                            System.out.print("Masukkan baris: ");
                            baris = scan.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = scan.nextInt();
                            scan.nextLine();
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                kursi = true;
                            } else {
                                System.out.println("Baris dan kolom kursi sudah terisi");
                            }
                        }
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = scan.next();

                        lanjut = next.equalsIgnoreCase("y");
                    }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Penonton pada baris ke-" + (i + 1) + ": ");
                        for (int j = 0; j < penonton[0].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.print(penonton[i][j]);
                            } else {
                                System.out.print("***");
                            }

                            if (j < penonton[0].length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        } while (pilihan >= 0);
    }
}
