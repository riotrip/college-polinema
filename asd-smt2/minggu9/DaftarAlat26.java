package minggu9;

public class DaftarAlat26 {
    Alat26 listAlat[] = new Alat26[5];
    int ida, top;

    void tambah(Alat26 l) {
        if (ida < listAlat.length) {
            listAlat[ida] = l;
            ida++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll() {
        for (Alat26 l : listAlat) {
            l.tampil();
            System.out.println("-----------------------------");
        }
    }

    void tampil() {
        for (Alat26 l : listAlat) {
            l.tampil();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listAlat.length - 1; i++) {
            for (int j = 1; j < listAlat.length - i; j++) {
                if (listAlat[j].harga26 < listAlat[j - 1].harga26) {
                    Alat26 temp = listAlat[j];
                    listAlat[j] = listAlat[j - 1];
                    listAlat[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listAlat.length - 1; i++) {
            int idaMin = i;
            for (int j = i + 1; j < listAlat.length; j++) {
                if (listAlat[j].stok26 > listAlat[idaMin].stok26) {
                    idaMin = j;
                }
            }
            Alat26 temp = listAlat[idaMin];
            listAlat[idaMin] = listAlat[i];
            listAlat[i] = temp;
        }
    }

    int sequentialSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listAlat.length; j++) {
            if (listAlat[j].nama26.equalsIgnoreCase(cari)) {
                posisi = j;
                listAlat[j].stok26--;
            }
        }
        return posisi;
    }

    void tampilData(String cari, int pos) {
        if (pos != -1 && pos < listAlat.length) {
            System.out.println("Anda alat: " + listAlat[pos].nama26);
            System.out.println("Stok: " + listAlat[pos].stok26);
            System.out.println("Harga sewa (satuan): " + listAlat[pos].harga26);
            System.out.println("Deskripsi: " + listAlat[pos].deskripsi26);
        } else {
            System.out.println("Alat " + cari + " tidak ditemukan");
        }
    }
    
    boolean cekStok(String cari) {
        for (Alat26 alat : listAlat) {
            if (alat != null && alat.nama26.equalsIgnoreCase(cari) && alat.stok26 > 0) {
                return true; 
            }
        }
        return false; 
    }
}
