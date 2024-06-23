package uas;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        KendaraanDLL26 kd = new KendaraanDLL26();
        PajakDLL26 pj = new PajakDLL26();

        kd.add("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);
        kd.add("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        kd.add("N 4511 A", "Arta", "Mobil", 2500, 2015, 3);
        kd.add("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);

        boolean run = true;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi berdasar nama Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            int input = scan.nextInt();
            System.out.println("++++++++++++++++++++++++");
            switch (input) {
                case 1:
                    System.out.println("Daftar Kendaraan");
                    System.out.println("++++++++++++++++++++++++");
                    kd.print();
                    break;
                case 2:
                    System.out.println("Masukkan Data Pembayaran");
                    System.out.println("++++++++++++++++++++++++");
                    System.out.print("Masukkan Nomer TNKB: ");
                    scan.nextLine();
                    String noTNKB = scan.nextLine();
                    System.out.print("Bulan Bayar: ");
                    int bulanBayar = scan.nextInt();
                    kd.bayarPajak(noTNKB, bulanBayar, pj);
                    break;
                case 3:
                    System.out.println("Daftar Transaksi Pembayaran Pajak");
                    System.out.println("++++++++++++++++++++++++");
                    pj.print();
                    break;
                case 4:
                    pj.sort();
                    pj.print();
                    break;
                case 5:
                    System.out.println("Keluar program\nTerimakasih!");
                    System.out.println("++++++++++++++++++++++++");
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println("++++++++++++++++++++++++");
                    break;
            }
        } while (run);
    }
}
