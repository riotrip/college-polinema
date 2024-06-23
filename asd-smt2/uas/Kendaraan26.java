package uas;

public class Kendaraan26 {
    String noTNKB, nama, jenis;
    int cc, tahun, bulanHarusBayar;
    Kendaraan26 prev, next;

    Kendaraan26() {

    }

    Kendaraan26(Kendaraan26 prev, String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar,
            Kendaraan26 next) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }
}
