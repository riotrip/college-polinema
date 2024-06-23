package minggu11.tugas2;

public class LinkedList26 {
    Node26 head, tail;

    boolean isEmpty() {
        return head != null;
    }

    void print() {
        if (isEmpty()) {
            Node26 tmp = head;
            int index = 1;
            System.out.println("Isi Antrian:");
            System.out.println("-----------------------------");
            while (tmp != null) {
                Mahasiswa26 mhs = tmp.data;
                System.out.println("Antrian Mahasiswa ke-" + index);
                System.out.println("NIM: " + mhs.nim + ", Nama: " + mhs.nama);
                tmp = tmp.next;
                index++;
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    int idx() {
        int count = 0;
        Node26 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void addLast(Mahasiswa26 input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
            System.out.println("-----------------------------");
            System.out.println("Antrian berhasil ditambahkan!\nNomor antrian: " + idx());
        } else {
            head = ndInput;
            tail = ndInput;
            System.out.println("-----------------------------");
            System.out.println("Antrian berhasil ditambahkan!\nNomor antrian: 1");
        }
    }

    Mahasiswa26 getData(int index) {
        Node26 tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp == null) {
                return null;
            }
            tmp = tmp.next;
        }
        return tmp != null ? tmp.data : null;
    }

    int indexOf(String key) {
        Node26 tmp = head;
        int index = 0;
        while (tmp != null) {
            if (tmp.data.nim.equals(key) || tmp.data.nama.equals(key)) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    void removeFirst() {
        if (!isEmpty()) {
            System.out.println("Antrian masih kosong," + "tidak dapat dihapus");
        } else if (head == tail) {
            Mahasiswa26 mhs = head.data;
            System.out.println("Antrian dengan NIM: " + mhs.nim + " dan Nama: " + mhs.nama + " berhasil dihapus!");
            head = tail = null;
        } else {
            Mahasiswa26 mhs = head.data;
            System.out.println("Antrian dengan NIM: " + mhs.nim + " dan Nama: " + mhs.nama + " berhasil dihapus!");
            head = head.next;
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            System.out.println("Antrian masih kosong," + "tidak dapat dihapus");
        } else if (head == tail) {
            Mahasiswa26 mhs = tail.data;
            System.out.println("Antrian dengan NIM: " + mhs.nim + " dan Nama: " + mhs.nama + " berhasil dihapus!");
            head = tail = null;
        } else {
            Mahasiswa26 mhs = tail.data;
            System.out.println("Antrian dengan NIM: " + mhs.nim + " dan Nama: " + mhs.nama + " berhasil dihapus!");
            Node26 temp = head;
            while (temp.next != tail) {
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(Mahasiswa26 mhs) {
        if (!isEmpty()) {
            System.out.println("Antrian masih kosong, tidak dapat dihapus");
            System.out.println("-----------------------------");
        } else {
            Node26 temp = head;
            Node26 prev = null;
            while (temp != null) {
                if (temp.data.nim.equals(mhs.nim) || temp.data.nama.equals(mhs.nama)) {
                    if (temp == head) {
                        removeFirst();
                    } else {
                        prev.next = temp.next;
                        if (temp.next == null) {
                            tail = prev;
                        }
                    }
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
            System.out.println("Antrian ke-" + (index + 1) + " berhasil dihapus!");
        } else {
            Node26 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
            System.out.println("Antrian ke-" + (index + 1) + " berhasil dihapus!");
        }
    }
}
