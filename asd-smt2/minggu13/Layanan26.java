package minggu13;

public class Layanan26 {
    int kode, harga;
    String nama;
    Layanan26 prev, next;

    Layanan26(Layanan26 prev, int kode, String nama, int harga, Layanan26 next) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.next = next;
    }
}
