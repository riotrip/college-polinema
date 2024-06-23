package minggu16.Tugas;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main26 {
    static Queue<Mahasiswa26> mhs = new LinkedList<>();
    static Queue<MataKuliah26> matkul = new LinkedList<>();
    static Queue<Nilai26> score = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    static void inputNilai() {
        System.out.println("--- INPUT NILAI ---");
        System.out.print("Masukkan nilai : ");
        double nilai = sc.nextDouble();
        sc.nextLine();
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM Nama Telf");
        mhs.forEach((mhs) -> {
            System.out.printf("%-3s %-12s %-10s\n", mhs.getNim(), mhs.getNama(), mhs.getTelf());
        });
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("***********************************************");
        System.out.println("Kode Mata Kuliah SKS");
        matkul.forEach((mk) -> {
            System.out.printf("%-5s %-40s %-2s\n", mk.getKode(), mk.getMataKul(), mk.getSks());
        });
        System.out.print("Masukkan Kode Mata Kuliah : ");
        String kode = sc.nextLine();
        String nama = "";
        for (Mahasiswa26 mhs : mhs) {
            if (mhs.getNim().equals(nim)) {
                nama = mhs.getNama();
            }
        }
        String mataKuliah = "";
        String sks = "";
        for (MataKuliah26 mk : matkul) {
            if (mk.getKode().equals(kode)) {
                mataKuliah = mk.getMataKul();
                sks = mk.getSks();
            }
        }
        score.add(new Nilai26(nim, nama, mataKuliah, sks, nilai));
    }

    static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***********************************************");
        System.out.println("NIM Nama Mata Kuliah SKS Nilai");
        score.forEach((n) -> {
            System.out.printf("%-5s %-10s %-10s %-2s %-4s\n", n.getNim(),
                    n.getNama(), n.getMataKuliah(), n.getSks(), n.getNilai());
        });
    }

    static void cariNilai() {
        tampilNilai();
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        boolean found = false;
        for (Nilai26 n : score) {
            if (n.getNim().equals(nim)) {
                System.out.println("NIM Nama Mata Kuliah SKS Nilai");
                System.out.printf("%-5s %-10s %-10s %-2s %-4s\n", n.getNim(),
                        n.getNama(), n.getMataKuliah(), n.getSks(), n.getNilai());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }

    static void sortData() {
        Nilai26[] nilaiArr = new Nilai26[score.size()];
        int i = 0;
        for (Nilai26 n : score) {
            nilaiArr[i] = n;
            i++;
        }
        for (int j = 0; j < nilaiArr.length - 1; j++) {
            for (int k = 0; k < nilaiArr.length - j - 1; k++) {
                if (nilaiArr[k].getNilai() < nilaiArr[k + 1].getNilai()) {
                    Nilai26 temp = nilaiArr[k];
                    nilaiArr[k] = nilaiArr[k + 1];
                    nilaiArr[k + 1] = temp;
                }
            }
        }
        score.clear();
        for (Nilai26 n : nilaiArr) {
            score.add(n);
        }
    }

    static void hapusData() {
        tampilNilai();
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        boolean found = false;
        for (Nilai26 n : score) {
            if (n.getNim().equals(nim)) {
                score.remove(n);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        mhs.add(new Mahasiswa26("20001", "Thalhah", "021xxx"));
        mhs.add(new Mahasiswa26("20002", "Zubair", "021xxx"));
        mhs.add(new Mahasiswa26("20003", "Abdul-Rahman", "021xxx"));
        mhs.add(new Mahasiswa26("20004", "Sa'ad", "021xxx"));
        mhs.add(new Mahasiswa26("20005", "Sa'id", "021xxx"));
        mhs.add(new Mahasiswa26("20006", "Ubaidah", "021xxx"));
        matkul.add(new MataKuliah26("00001", "Internet Of Things", "3"));
        matkul.add(new MataKuliah26("00002", "Algoritma dan Struktur Data", "2"));
        matkul.add(new MataKuliah26("00003", "Algoritma dan Pemograman", "2"));
        matkul.add(new MataKuliah26("00004", "Praktikum Algoritma dan Struktur Data", "3"));
        matkul.add(new MataKuliah26("00004", "Praktikum Algoritma dan Pemograman", "3"));
        score.add(new Nilai26("20002", "Zubair", "Internet Of Things", "3", 90));
        boolean run = true;
        do {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Nilai");
            System.out.println("0. Keluar");
            System.out.println("***********************************************");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilai();
                    break;
                case 4:
                    sortData();
                    tampilNilai();
                    break;
                case 5:
                    hapusData();
                    break;
                case 0:
                    System.out.println("Keluar program\nTerimakasih!");
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (run);
    }
}
