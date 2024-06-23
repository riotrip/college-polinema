package minggu3;

public class Mahasiswa {
    public String nama;
    public int nim;
    public char jk;
    public float ipk;

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis kelamin: " + jk);
        System.out.println("IPK: " + ipk);
    }

    public float hitungRataRataIPK(Mahasiswa[] mahasiswas) {
        float totalIPK = 0;
        for (Mahasiswa mhs : mahasiswas) {
            totalIPK += mhs.ipk;
        }
        return totalIPK / mahasiswas.length;
    }

    public Mahasiswa ipTertinggi(Mahasiswa[] mahasiswas) {
        Mahasiswa mahasiswaTerbaik = mahasiswas[0];
        for (Mahasiswa mhs : mahasiswas) {
            if (mhs.ipk > mahasiswaTerbaik.ipk) {
                mahasiswaTerbaik = mhs;
            }
        }
        return mahasiswaTerbaik;
    }
}