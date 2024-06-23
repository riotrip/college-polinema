package minggu9;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        DaftarAlat26 data = new DaftarAlat26();

        Alat26 a1 = new Alat26("Perkakas", 20, 150000, "Perkakas berupa alat makan (gelas, piring, sendok, garpu) dan alat masak (panci, wajan, spatula)");
        Alat26 a2 = new Alat26("Tenda", 5, 30000, "Tenda didalamnya memuat 2 orang");
        Alat26 a3 = new Alat26("Pemanggang", 15, 200000, "Pemanggang BBQ sudah termasuk arang dan capit");
        Alat26 a4 = new Alat26("Dekorasi", 30, 10000, "Dekorasi berupa balon, lampu hias, dan taplak meja");
        Alat26 a5 = new Alat26("Sound", 1, 300000, "Sound system mini");

        data.tambah(a1);
        data.tambah(a2);
        data.tambah(a3);
        data.tambah(a4);
        data.tambah(a5);

        Scanner scan = new Scanner(System.in);
        boolean keluar = false;
        do {
            System.out.println("\n-----------------------------");
            System.out.println("Selamat datang di program Penyewaan Alat Pesta");
            System.out.println("-----------------------------");
            System.out.println("Pilih Menu: ");
            System.out.println("1. Lihat Alat");
            System.out.println("2. Sewa Alat");
            System.out.println("0. Keluar");
            System.out.print("(1/2/0): ");
            int pilihMenu = scan.nextInt();

            switch (pilihMenu) {
                case 1:
                    boolean kembali = false;
                    do {
                        System.out.println("\n-----------------------------");
                        System.out.println("Lihat Alat berdasarkan:");
                        System.out.println("-----------------------------");
                        System.out.println("1. Harga Termurah");
                        System.out.println("2. Stok Terbanyak");
                        System.out.println("0. Kembali");
                        System.out.print("(1/2/0): ");
                        int cekAlat = scan.nextInt();

                        switch (cekAlat) {
                            case 1:
                                System.out.println("\n-----------------------------");
                                System.out.println("Pilihan Alat berdasarkan Harga Termurah");
                                System.out.println("-----------------------------");
                                data.bubbleSort();
                                data.tampil();
                                break;
                            case 2:
                                System.out.println("\n-----------------------------");
                                System.out.println("Pilihan Alat berdasarkan Stok Terbanyak");
                                System.out.println("-----------------------------");
                                data.selectionSort();
                                data.tampil();
                                break;
                            case 0:
                                System.out.println("-----------------------------");
                                System.out.println("Kembali ke menu awal!");
                                kembali = true;
                                break;
                            default:
                                System.out.println("-----------------------------");
                                System.out.println("Pilihan tidak valid!");
                        }
                    } while (!kembali);
                    break;
                case 2:
                    System.out.println("Daftar alat: ");
                    System.out.println("-----------------------------");
                    data.tampilAll();
                    System.out.println("Pilih alat yang ingin anda sewa:");
                    System.out.print("Nama alat: ");
                    scan.nextLine();
                    String cari = scan.nextLine();
                    if (data.cekStok(cari)) {
                        int posisi = data.sequentialSearch(cari);
                        data.tampilData(cari, posisi);
                    } else {
                        System.out.println(
                                "Alat " + cari + " tidak dapat disewa karena stok kosong atau tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("-----------------------------");
                    System.out.println("Keluar program\nTerimakasih!");
                    keluar = true;
                    break;
                default:
                    System.out.println("-----------------------------");
                    System.out.println("Pilihan tidak valid!");
            }
        } while (!keluar);
    }
}
