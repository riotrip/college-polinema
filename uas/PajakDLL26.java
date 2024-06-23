package uas;

public class PajakDLL26 {
    TransaksiPajak26 head;
    int size;
    int totalPendapatan;

    PajakDLL26() {
        head = null;
        size = 0;
        totalPendapatan = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void add(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan26 kendaraan) {
        TransaksiPajak26 newTransaksi = new TransaksiPajak26(kode, nominalBayar, denda, bulanBayar, kendaraan);
        if (isEmpty()) {
            head = newTransaksi;
        } else {
            TransaksiPajak26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTransaksi;
        }
        size++;
        totalPendapatan += nominalBayar + denda;
    }

    void print() {
        if (!isEmpty()) {
            TransaksiPajak26 current = head;
            System.out.println("|Kode\t|TNKB\t\t|Nama\t|Nominal\t|Denda");
            int kode = 1;
            while (current != null) {
                Kendaraan26 kendaraan = current.kendaraan;
                System.out.println("|" + kode + "\t|" + kendaraan.noTNKB + "\t|" + kendaraan.nama + "\t|" +
                        (current.nominalBayar + current.denda) + "\t\t|" + current.denda);
                current = current.next;
                kode++;
            }
            System.out.println("Total Pendapatan: " + totalPendapatan);
        } else {
            System.out.println("Belum ada transaksi pajak yang dicatat.");
        }
    }

    void sort() {
        if (isEmpty() || size == 1) {
            return;
        }
        TransaksiPajak26 sorted = null;
        TransaksiPajak26 current = head;
        while (current != null) {
            TransaksiPajak26 next = current.next;
            if (sorted == null || sorted.kendaraan.nama.compareTo(current.kendaraan.nama) > 0) {
                current.next = sorted;
                sorted = current;
            } else {
                TransaksiPajak26 temp = sorted;
                while (temp.next != null && temp.next.kendaraan.nama.compareTo(current.kendaraan.nama) < 0) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
            current = next;
        }
        head = sorted;
    }
}
