package minggu13;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList26 list = new DoubleLinkedList26();
        LayananDLL26 layanan = new LayananDLL26();
        layanan.add(1, "Pompa Ban", 2000);
        layanan.add(2, "Service", 10000);
        layanan.add(3, "Tambal Ban", 5000);
        int totalBiaya = 0;
        boolean run = true;
        do {
            System.out.println("\n===============================");
            System.out.println("Selamat Datang di Bengkel Mobil");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Total Pemasukkan");
            System.out.println("0. Keluar");
            System.out.print("(1/2/3/4/0): ");
            int input = scan.nextInt();
            System.out.println("===============================");
            switch (input) {
                case 1:
                    System.out.println("Masukkan Data Antrian:");
                    System.out.println("===============================");
                    System.out.print("Input Nama: ");
                    scan.nextLine();
                    String nama = scan.nextLine();
                    System.out.print("Input No HP: ");
                    String noHp = scan.nextLine();
                    Pelanggan26 inputPelanggan = new Pelanggan26(nama, noHp);
                    System.out.println("===============================");
                    list.addLast(inputPelanggan);
                    System.out.println("===============================");
                    break;
                case 2:
                    System.out.println("Daftar Antrian: ");
                    System.out.println("===============================");
                    list.print();
                    System.out.println("===============================");
                    break;
                case 3:
                    list.removeFirst();
                    boolean jalan = true;
                    do {
                        System.out.println("Pilih Layanan");
                        System.out.println("-------------------------------");
                        System.out.println("1. Pompa Ban (Rp 2.000)");
                        System.out.println("2. Service (Rp 10.000)");
                        System.out.println("3. Tambal Ban (Rp 5.000)");
                        System.out.println("4. Sort berdasarkan harga termurah");
                        System.out.println("-------------------------------");
                        System.out.print("(1/2/3/4): ");
                        int inputLayanan = scan.nextInt();
                        System.out.println("-------------------------------");
                        switch (inputLayanan) {
                            case 1:
                                totalBiaya += 2000;
                                System.out.println("Pompa Ban");
                                System.out.println("-------------------------------");
                                System.out.println("");
                                jalan = false;
                                break;
                            case 2:
                                totalBiaya += 10000;
                                System.out.println("Tambal Ban");
                                System.out.println("-------------------------------");
                                jalan = false;
                                break;
                            case 3:
                                totalBiaya += 5000;
                                System.out.println("Tambal Ban");
                                System.out.println("-------------------------------");
                                jalan = false;
                                break;
                            case 4:
                                layanan.sort();
                                System.out.println("Urutkan Layanan Berdasarkan Harga Termurah");
                                System.out.println("-------------------------------");
                                layanan.print();
                                break;
                            default:
                                System.out.println("Pilihan tidak valid!");
                                System.out.println("-------------------------------");
                                break;
                        }
                    } while (jalan);
                    break;
                case 4:
                    System.out.println("Total Pemasukkan: " + totalBiaya);
                    System.out.println("-------------------------------");
                    break;
                case 0:
                    System.out.println("Keluar program\nTerimakasih!");
                    System.out.println("===============================");
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println("===============================");
                    break;
            }
        } while (run);
    }
}
