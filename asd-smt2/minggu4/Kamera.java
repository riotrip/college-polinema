package minggu4;

public class Kamera {
    public String merk;
    public String tipe;
    public double hargaSewaPerHari;

    public Kamera(String merk, String tipe, double harga) {
        this.merk = merk;
        this.tipe = tipe;
        hargaSewaPerHari = harga;
    }

    public void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Harga sewa perhari: Rp. " + hargaSewaPerHari);
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    public void setHargaSewaPerHari(double harga) {
        hargaSewaPerHari = harga;
    }

    public double hitungBiayaSewa(int hari) {
        return hargaSewaPerHari * hari;
    }

}
