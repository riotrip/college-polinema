package minggu13;

public class DoubleLinkedList26 {
    Node26 head;
    int size;
    Layanan26 listLayanan[] = new Layanan26[5];
    int idl, top;

    DoubleLinkedList26() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Pelanggan26 item) {
        if (isEmpty()) {
            head = new Node26(null, item, null);
        } else {
            Node26 newNode = new Node26(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        Pelanggan26 antri = head.data;
        size++;
        System.out.println(antri.namaPelanggan + " berhasil dimasukkan dalam antrian ke-" + size);
    }

    void addLast(Pelanggan26 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node26 newNode = new Node26(current, item, null);
            current.next = newNode;
            Pelanggan26 antri = current.next.data;
            size++;
            System.out.println(antri.namaPelanggan + " berhasil dimasukkan dalam antrian ke-" + size);
        }
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            int index = 1;
            while (tmp != null) {
                Pelanggan26 antri = tmp.data;
                System.out.println("-------------------------------");
                System.out.println("Antrian ke-" + index);
                System.out.println("-------------------------------");
                System.out.println("Nama Pelanggan: " + antri.namaPelanggan);
                System.out.println("No HP: " + antri.noHp);
                tmp = tmp.next;
                index++;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            Pelanggan26 data = head.data;
            String dataNama = data.namaPelanggan;
            String dataHp = data.noHp;
            getData(dataNama, dataHp);
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node26 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Pelanggan26 data = current.next.data;
        String dataNama = data.namaPelanggan;
        String dataHp = data.noHp;
        getData(dataNama, dataHp);
        current.next = null;
        size--;
    }

    void getData(String nama, String noHp) {
        System.out.println("Antrian dengan Nama: " + nama + " dan No. HP: " + noHp + " Selesai!");
    }
}
