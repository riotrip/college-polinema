package minggu15;

public class Node26 {
    int data;
    Node26 prev, next;
    int jarak;

    Node26(Node26 prev, int data, int jarak, Node26 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
