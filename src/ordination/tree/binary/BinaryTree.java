package ordination.tree.binary;

import ordination.tree.Node;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public int maxLevel = 0;

    public BinaryTree(int data) {
        this.root = new Node(data);
    }

    public BinaryTree(Node node) {
        if (node != null) this.root = node;
    }

    public BinaryTree() {}

    public void posOrderTraversal(Node node) {
        if (node == null) {
            node = this.root;
        }

        if (node.left != null) simetricTraversal(node.left);
        if (node.right != null) simetricTraversal(node.right);

        System.out.print(node.data + " ");
    }

    public int height(Node node) {
        if (node == null) {
            node = this.root;
        }

        int lHeight = 0;
        int rHeight = 0;

        if (node.left != null) lHeight = height(node.left);
        if (node.right != null) rHeight = height(node.right);

        if (rHeight > lHeight) return rHeight + 1;

        return lHeight + 1;
    }

    public void preOrderTraversal(Node node) {
        if (node == null) {
            node = this.root;
        }

        System.out.print(node.data + " ");

        if (node.left != null) simetricTraversal(node.left);
        if (node.right != null) simetricTraversal(node.right);
    }

    public void simetricTraversal(Node node) {
        if (node == null) {
            node = this.root;
        }

        if (node.left != null) simetricTraversal(node.left);

        System.out.print(node.data + " ");

        if (node.right != null) simetricTraversal(node.right);
    }

    public void borderLeftView(Node node, int level, List<Integer> list) {
        if (node == null) return;

        if (maxLevel < level) {
            list.add(node.data);
            maxLevel = level;
        }

        borderLeftView(node.left, level + 1, list);
    }

    public void borderRightView(Node node, int level, List<Integer> list) {
        if (node == null) return;

        if (maxLevel < level) {
            list.add(node.data);
            maxLevel = level;
        }

        borderRightView(node.right, level + 1, list);
    }

    public void levelOrderTraversal(Node node) {
        if (node == null) node = this.root;

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.poll();

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);

            System.out.print(node.data + " ");
        }
    }
}