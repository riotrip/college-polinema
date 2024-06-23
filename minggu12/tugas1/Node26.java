package minggu12.tugas1;

public class Node26 {
    Pengantri26 data;
    Node26 prev, next;

    Node26(Node26 prev, Pengantri26 item, Node26 next) {
        this.prev = prev;
        data = item;
        this.next = next;
    }
}
