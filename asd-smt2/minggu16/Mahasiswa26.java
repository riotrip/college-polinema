package minggu16;

public class Mahasiswa26 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa26() {
    }

    public Mahasiswa26(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
