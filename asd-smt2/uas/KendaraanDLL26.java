package uas;

public class KendaraanDLL26 {
    Kendaraan26 head;
    int size;

    KendaraanDLL26() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        if (isEmpty()) {
            head = new Kendaraan26(null, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
        } else {
            Kendaraan26 node = new Kendaraan26(null, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    void add(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        if (isEmpty()) {
            addFirst(noTNKB, nama, jenis, cc, tahun, bulanHarusBayar);
        } else {
            Kendaraan26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Kendaraan26 node = new Kendaraan26(current, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
            current.next = node;
            size++;
        }
    }

    void print() {
        if (!isEmpty()) {
            Kendaraan26 tmp = head;
            System.out.println("|Nomor TNKB\t|Nama Pemilik\t|Jenis\t|CC Kendaraan\t|Tahun\t|Bulan harus Bayar");
            while (tmp != null) {
                System.out.println("|" + tmp.noTNKB + "\t" + "|" + tmp.nama + "\t\t" + "|" + tmp.jenis + "\t" + "|"
                        + tmp.cc + "\t\t" + "|" + tmp.tahun + "\t" + "|" + tmp.bulanHarusBayar);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Kendaraan kosong");
        }
    }

    void bayarPajak(String noTNKB, int bulanBayar, PajakDLL26 pajak) {
        if (!isEmpty()) {
            Kendaraan26 current = head;
            int kode = 1;
            System.out.println("|Kode\t|TNKB\t\t|Nama\t|Nominal\t|Denda");
            while (current != null) {
                if (current.noTNKB.equals(noTNKB)) {
                    long tarifPajak = 0;
                    if (current.jenis.equalsIgnoreCase("motor")) {
                        if (current.cc < 100) {
                            tarifPajak = 100000;
                        } else if (current.cc >= 100 && current.cc <= 250) {
                            tarifPajak = 250000;
                        } else {
                            tarifPajak = 500000;
                        }
                    } else if (current.jenis.equalsIgnoreCase("mobil")) {
                        if (current.cc < 1000) {
                            tarifPajak = 750000;
                        } else if (current.cc >= 1000 && current.cc <= 2500) {
                            tarifPajak = 1000000;
                        } else {
                            tarifPajak = 1500000;
                        }
                    }

                    long denda = 0;
                    int bulanSelisih = bulanBayar - current.bulanHarusBayar;
                    if (bulanSelisih > 0) {
                        if (bulanSelisih <= 3) {
                            denda = bulanSelisih * 50000;
                        } else {
                            denda = 150000 + (bulanSelisih - 3) * 50000;
                        }
                    }
                    long totalBayar = tarifPajak + denda;
                    pajak.add(0, tarifPajak, denda, bulanBayar, current);
                    System.out.println("|" + kode + "\t" + "|" + current.noTNKB + "\t" + "|" + current.nama + "\t" + "|"
                            + totalBayar + "\t\t" + "|" + denda + "\t");
                }
                current = current.next;
                kode++;
            }
        } else {
            System.out.println("Data kendaraan kosong");
        }
    }
}
