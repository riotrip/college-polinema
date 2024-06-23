package minggu2;

public class Buku26 {
    String judul, pengarang;
    int halaman, stok, harga, totHrg;
    double hargaBayar, diskon = 0.0;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Total harga penjualan Rp " + totHrg);
        System.out.println("Harga bayar setelah diskon: " + hargaBayar);
        System.out.println("======================");
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println("Terjual: " + jml + " buku");
            hitungTotalHarga(jml);
        } else {
            System.out.println("Tidak ada stok");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungTotalHarga(int jml) {
        totHrg = harga * jml;
    }

    void hitungDiskon() {
        if (totHrg > 150000) {
            diskon = 0.12 * totHrg;
            System.out.println("Anda mendapatkan diskon sebesar 12%");
        } else if (totHrg >= 75000 && totHrg <= 150000) {
            diskon = 0.05 * totHrg;
            System.out.println("Anda mendapatkan diskon sebesar 5%");
        } else {
            System.out.println("Anda tidak mendapatkan diskon");
        }
        hargaBayar(diskon);
    }

    void hargaBayar(double disc) {
        hargaBayar = totHrg - disc;
    }

    public Buku26() {

    }

    public Buku26(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}