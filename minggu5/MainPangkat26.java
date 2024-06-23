package minggu5;

import java.util.Scanner;

public class MainPangkat26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        do {

            System.out.println("\n========================================");
            System.out.println("Program penghitung pangkat");
            System.out.println("========================================");
            System.out.println("Masukkan jumlah elemen yang dihitung: ");
            int elemen = scan.nextInt();

            Pangkat[] png = new Pangkat[elemen];
            for (int i = 0; i < elemen; i++) {
                System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
                int nilai = scan.nextInt();
                System.out.println("Masukkan nilai pangkat: ");
                int pangkat = scan.nextInt();
                png[i] = new Pangkat(nilai, pangkat);
            }

            System.out.println("========================================");
            System.out.println("Pilih algoritma untuk menghitung");
            System.out.println("========================================");
            System.out.println("1. Brute Force");
            System.out.println("2. Divide and Conquer");
            System.out.println("0. Keluar");
            System.out.print("(1/2/0): ");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("========================================");
                    System.out.println("HASIL PANGKAT - BRUTFORCE");
                    System.out.println("========================================");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari "
                                + png[i].nilai + " pangkat "
                                + png[i].pangkat + " adalah "
                                + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                    }
                    break;
                case 2:
                    System.out.println("========================================");
                    System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                    System.out.println("========================================");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari "
                                + png[i].nilai + " pangkat "
                                + png[i].pangkat + " adalah "
                                + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    }
                    break;
                case 0:
                    System.out.println("========================================");
                    System.out.println("Terima Kasih!");
                    run = false;
                    break;
                default:
                    System.out.println("========================================");
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (run);

    }
}
