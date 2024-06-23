package minggu7;

public class PencarianBuku26 {
    Buku26 listBk[] = new Buku26[2];
    int idx;

    void tambah(Buku26 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku26 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari) {
        int count = 0;
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Anda menginput judul yang sama lebih dari 1 kali");
        }
        return posisi;
    }

    public void tampilPosisi(String cari, int pos) {
        if (pos != -1 && pos < listBk.length) {
            System.out.println("Data: " + cari + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
    }

    public void tampilData(String cari, int pos) {
        if (pos != -1 && pos < listBk.length) {
            System.out.println("Kode buku\t: " + listBk[pos].kodeBuku);
            System.out.println("Judul\t\t: " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t: " + listBk[pos].pengarang);
            System.out.println("Stock\t\t: " + listBk[pos].stock);
        } else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
    }

    void bubbleSort() {
        int n = listBk.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku26 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            int hasilCasting = cari.compareToIgnoreCase(listBk[mid].judulBuku);
            if (hasilCasting == 0) {
                return mid;
            } else if (hasilCasting < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public Buku26 FindBuku(int cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                return listBk[j];
            }
        }
        return null;
    }
}
