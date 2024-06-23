package minggu13;

public class Node26 {
    Pelanggan26 data;
    Node26 prev, next;

    Node26(Node26 prev, Pelanggan26 item, Node26 next) {
        this.prev = prev;
        data = item;
        this.next = next;
    }
}
