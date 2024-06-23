package minggu13;

public class LayananDLL26 {
    Layanan26 head;
    int size;
    int totalPemasukan;

    public LayananDLL26() {
        head = null;
        size = 0;
        totalPemasukan = 0;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int kode, String nama, int harga) {
        if (isEmpty()) {
            head = new Layanan26(null, kode, nama, harga, null);
        } else {
            Layanan26 node = new Layanan26(null, kode, nama, harga, head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void add(int kode, String nama, int harga) {
        if (isEmpty()) {
            addFirst(kode, nama, harga);
        } else {
            Layanan26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Layanan26 node = new Layanan26(current, kode, nama, harga, null);
            current.next = node;
            size++;
        }
    }

    public void sort() {
        if (isEmpty() || size == 1) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            Layanan26 current = head;
            for (int j = 0; j < size - i - 1; j++) {
                if (current.harga > current.next.harga) {
                    int tempKode = current.kode;
                    String tempNama = current.nama;
                    int tempHar = current.harga;

                    current.kode = current.next.kode;
                    current.nama = current.next.nama;
                    current.harga = current.next.harga;

                    current.next.kode = tempKode;
                    current.next.nama = tempNama;
                    current.next.harga = tempHar;
                }
                current = current.next;
            }
        }
    }

    public void print() {
        if (!isEmpty()) {
            Layanan26 tmp = head;
            while (tmp != null) {
                System.out.println("-------------------------------");
                System.out.println("Kode: " + tmp.kode);
                System.out.println("Nama Layanan: " + tmp.nama);
                System.out.println("Harga: " + tmp.harga);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Layanan kosong");
        }
    }
}
