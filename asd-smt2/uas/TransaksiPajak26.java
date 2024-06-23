package uas;

public class TransaksiPajak26 {
    int kode, bulanBayar;
    long nominalBayar, denda;
    Kendaraan26 kendaraan;
    TransaksiPajak26 next;

    TransaksiPajak26() {

    }

    TransaksiPajak26(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan26 kendaraan) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
        this.next = null;
    }
}
