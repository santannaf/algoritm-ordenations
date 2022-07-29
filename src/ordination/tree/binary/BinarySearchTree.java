package ordination.tree.binary;

import ordination.tree.Node;

public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree(Node node) {
        super(node);
    }

    public BinarySearchTree() {
    }

    public BinarySearchTree search(int value, Node node) {

        if (node == null) return null;

        if (value == node.data) return new BinarySearchTree(node);

        if (value < node.data) {
            return search(value, node.left);
        } else {
            return search(value, node.right);
        }
    }

    public void insert(int value) {
        Node parent = null;
        Node x = this.root;

        while (x != null) {
            parent = x;
            if (value < x.data) x = x.left;
            else x = x.right;
        }

        if (parent == null) this.root = new Node(value);
        else if (value < parent.data) parent.left = new Node(value);
        else parent.right = new Node(value);
    }

    public Node min(Node node) {
        if (node == null) node = this.root;

        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public Node max(Node node) {
        if (node == null) node = this.root;

        while (node.right != null) {
            node = node.right;
        }

        return node;
    }

    public Node remove(int value, Node node) {

        if (node == null) node = this.root;

        if (value < node.data) {
            node.left = remove(value, node.left);
        } else if (value > node.data) {
            node.right = remove(value, node.right);
        } else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            else {
                Node substitute = min(node.right);
                node.data = substitute.data;
                node.right = remove(substitute.data, node.right);
            }
        }

        return node;
    }
}