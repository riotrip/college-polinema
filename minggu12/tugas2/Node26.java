package minggu12.tugas2;

public class Node26 {
    Film26 data;
    Node26 prev, next;

    Node26(Node26 prev, Film26 item, Node26 next) {
        this.prev = prev;
        data = item;
        this.next = next;
    }
}
