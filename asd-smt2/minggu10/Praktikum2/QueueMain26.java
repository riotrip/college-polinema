package minggu10.Praktikum2;

import java.util.Scanner;

public class QueueMain26 {
    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = scan.nextInt();

        Queue26 antri = new Queue26(jumlah);
        int pilih;

        do {
            menu();
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = scan.nextLine();
                    System.out.print("Umur: ");
                    int umur = scan.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = scan.nextDouble();
                    Nasabah26 nb = new Nasabah26(norek, nama, alamat, umur, saldo);
                    scan.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah26 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                            && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " "
                                + data.alamat + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
