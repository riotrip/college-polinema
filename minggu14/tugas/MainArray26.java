package minggu14.tugas;

public class MainArray26 {
    public static void main(String[] args) {
        BinaryTreeArray26 bta = new BinaryTreeArray26();
        bta.add(6);
        bta.add(4);
        bta.add(8);
        bta.add(3);
        bta.add(5);
        bta.add(7);
        bta.add(9);
        System.out.print("Preorder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.print("InOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bta.traversePostOrder(0);
    }
}
