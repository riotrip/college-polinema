package minggu9;

public class Alat26 {
    String nama26, deskripsi26;
    int stok26;
    double harga26;

    Alat26(String nama26, int stok26,double harga26, String deskripsi26) {
        this.nama26 = nama26;
        this.stok26 = stok26;
        this.harga26 = harga26;
        this.deskripsi26 = deskripsi26;
    }

    void tampil() {
        System.out.println("Nama alat: " + nama26);
        System.out.println("Stok: " + stok26);
        System.out.println("Harga sewa (satuan): " + harga26);
        System.out.println("Deskripsi: " + deskripsi26);
    }
}
