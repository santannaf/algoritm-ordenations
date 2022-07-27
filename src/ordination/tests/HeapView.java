package ordination.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
    int number;
    Node left, right;

    public Node(int number) {
        this.number = number;
    }
}

class ViewTree {
    int maxLevel = 0;

    void viewTreeLeft(Node root, int level, List<Integer> list) {
        if (root == null) return;

        if (maxLevel < level) {
            list.add(root.number);
            maxLevel = level;
        }

        viewTreeLeft(root.left, level + 1, list);
    }

    void viewTreeRight(Node root, int level, List<Integer> list) {
        if (root == null) return;

        if (maxLevel < level) {
            list.add(root.number);
            maxLevel = level;
        }

        viewTreeRight(root.right, level + 1, list);
    }
}

public class HeapView {
    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.right = new Node(4);
        root.left.left = new Node(5);
        root.left.left.left = new Node(6);
        root.left.left.right = new Node(7);

        root.right.right = new Node(8);
        root.right.left = new Node(9);
        root.right.right.right = new Node(10);
        root.right.right.left = new Node(11);

        List<Integer> list = new ArrayList<>();

        ViewTree tree = new ViewTree();
        tree.viewTreeLeft(root.left, 1, list);

        Collections.reverse(list);

        tree.maxLevel = 0;
        tree.viewTreeRight(root, 1, list);

        for (Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
