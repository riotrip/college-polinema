package minggu14.tugas;

public class BinaryTree26 {
    Node26 root;

    public BinaryTree26() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    Node26 addRecursive(Node26 root, int data) {
        if (root == null) {
            root = new Node26(data);
            return root;
        }
        if (data < root.data) {
            root.left = addRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = addRecursive(root.right, data);
        }
        return root;
    }

    void add(int data) {
        root = addRecursive(root, data);
    }

    void traversePreOrder(Node26 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node26 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node26 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    int cariMin() {
        if (isEmpty()) {
            System.out.println("Binary Tree kosong!");
            return -1;
        }
        Node26 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    int cariMax() {
        if (isEmpty()) {
            System.out.println("Binary Tree kosong!");
            return -1;
        }
        Node26 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    void leaf(Node26 node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        leaf(node.left);
        leaf(node.right);
    }

    int countLeaf(Node26 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaf(node.left) + countLeaf(node.right);
    }
}
