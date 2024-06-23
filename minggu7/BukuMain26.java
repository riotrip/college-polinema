package minggu7;

import java.util.Scanner;

public class BukuMain26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku26 data = new PencarianBuku26();
        int jumBuku = 2;

        System.out.println("----------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari Kode Buku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("==================");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku26 m = new Buku26(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("==========================================");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("_____________________________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Judul Buku yang dicari: ");
        System.out.print("Judul Buku: ");
        String cari = s1.nextLine();
        data.bubbleSort();

        System.out.println("Menggunakan sequential search");

        int posisi = data.FindSeqSearch(cari);

        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("==================================");
        System.out.println("Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
