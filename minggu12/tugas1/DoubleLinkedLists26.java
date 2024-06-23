package minggu12.tugas1;

public class DoubleLinkedLists26 {
    Node26 head;
    int size;

    public DoubleLinkedLists26() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Pengantri26 item) {
        if (isEmpty()) {
            head = new Node26(null, item, null);
        } else {
            Node26 newNode = new Node26(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pengantri26 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node26 newNode = new Node26(current, item, null);
            current.next = newNode;
            size++;
        }
        System.out.println("Berhasil diisi");
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            int index = 0;
            System.out.println("|No.\t|Nama\t|");
            while (tmp != null) {
                Pengantri26 antri = tmp.data;
                System.out.println("|" + antri.no + "\t|" + antri.nama + "\t|");
                tmp = tmp.next;
                index++;
            }
            System.out.println("Sisa Antrian: " + index);
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            Pengantri26 antri = head.data;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println(antri.nama + " telah selesai divaksinasi!");
        }
    }

    public void removeLast() throws Exception {
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
        Pengantri26 antri = current.next.data;
        current.next = null;
        size--;
        System.out.println(antri.nama + " telah selesai divaksinasi!");
    }

    public Pengantri26 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public Pengantri26 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node26 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Pengantri26 get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node26 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
