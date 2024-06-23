package minggu12.tugas1;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedLists26 list = new DoubleLinkedLists26();
        boolean run = true;
        do {
            System.out.println("\n++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EKSTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Antrian: ");
                    int no = scan.nextInt();
                    System.out.println("Nama Penerima: ");
                    scan.nextLine();
                    String nama = scan.nextLine();
                    Pengantri26 antrian = new Pengantri26(no, nama);
                    list.addLast(antrian);
                    break;
                case 2:
                    list.removeFirst();
                    break;

                case 3:
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("+++++++++++++++++++++++");
                    list.print();
                    break;
                case 4:
                    System.out.println("------------------------------");
                    System.out.println("Keluar program\nTerimakasih!");
                    System.out.println("------------------------------");
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (run);
    }
}
