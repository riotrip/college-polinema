package minggu16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMahasiswa26 {
    List<Mahasiswa26> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa26... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa26 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        sortingAscending();
        return Collections.binarySearch(mahasiswas, new Mahasiswa26(nim, "", ""),
                (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortingAscending() {
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortingDescending() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa26 lm = new ListMahasiswa26();

        Mahasiswa26 m = new Mahasiswa26("201234", "Noureen", "021xx1");
        Mahasiswa26 m1 = new Mahasiswa26("201235", "Akhleema", "021xx2");
        Mahasiswa26 m2 = new Mahasiswa26("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);

        lm.tampil();
        lm.sortingAscending();
        System.out.println("\nSorting Ascending:");
        lm.tampil();
        lm.sortingDescending();
        System.out.println("\nSorting Descending:");
        lm.tampil();
        lm.update(lm.binarySearch("201235"), new Mahasiswa26("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
