package minggu11.tugas1;

public class LinkedList26 {
    Node26 head, tail;

    boolean isEmpty() {
        return head != null;
    }

    void print() {
        if (isEmpty()) {
            Node26 tmp = head;
            int index = 1;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                Mahasiswa26 mhs = tmp.data;
                System.out.println("Mahasiswa ke-" + index);
                System.out.println("NIM: " + mhs.nim + ", Nama: " + mhs.nama);
                tmp = tmp.next;
                index++;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong\n");
        }
    }

    void addFirst(Mahasiswa26 input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void addLast(Mahasiswa26 input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(Mahasiswa26 key, Mahasiswa26 input) {
        Node26 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                Node26 ndInput = new Node26(input, temp.next);
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, Mahasiswa26 input) {
        if (index < 0) {
            System.out.println("Perbaiki logikanya!" + "Kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node26 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node26(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
