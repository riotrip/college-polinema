package minggu10.Tugas;

import java.util.Scanner;

public class QueueMain26 {
    public static void menu() {
        System.out.println("\nMasukkan operasi yang diinginkan:");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Kurangi Antrian");
        System.out.println("3. Lihat Antrian");
        System.out.println("4. Antrian Terdepan");
        System.out.println("5. Antrian Paling Belakang");
        System.out.println("6. Cari Antrian");
        System.out.println("7. Daftar Pembeli");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian: ");
        int n = scan.nextInt();

        Queue26 Q = new Queue26(n);
        int pilih;

        do {
            menu();
            pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan antrian baru!");
                    System.out.print("Masukkan Nama: ");
                    scan.nextLine();
                    String nama = scan.nextLine();
                    System.out.print("Masukkan Nomor HP: ");
                    int noHP = scan.nextInt();
                    Pembeli26 pb = new Pembeli26(nama, noHP);
                    scan.nextLine();
                    Q.Enqueue(pb);
                    break;
                case 2:
                    Pembeli26 keluar = Q.Dequeue();
                    if (!"".equals(keluar.nama) && keluar.noHP != 0) {
                        System.out.println("Antrian yang keluar: ");
                        System.out.println("Nama: " + keluar.nama + ", No. HP: " + keluar.noHP);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    Q.print();
                    System.out.print("Cari antrian berdasarkan nama: ");
                    scan.nextLine();
                    String cari = scan.nextLine();
                    Q.peekPosition(cari);
                    break;
                case 7:
                    System.out.println("Pembeli dalam antrian: ");
                    Q.print();
                    Q.dataPembeli();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
