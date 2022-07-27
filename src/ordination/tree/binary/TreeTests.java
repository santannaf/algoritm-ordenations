package ordination.tree.binary;

import ordination.tree.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TreeTests {
    public static void main(String[] args) {

        //        int[] numbers = new int[3];
//        for (int i = 0; i < 3; i++) {
//            int number = ThreadLocalRandom.current().nextInt(1, 10);
//            numbers[i] = number;
//        }
//        System.out.println(Arrays.toString(numbers));

        int number = ThreadLocalRandom.current().nextInt(100, 105);
        var tree = new BinaryTree(number);

        tree.root.left = new Node(18);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(7);

        tree.root.right = new Node(25);
        tree.root.right.left = new Node(85);
        tree.root.right.right = new Node(96);

        tree.posOrderTraversal(null);
        System.out.print(" >>> Pós ordem percurso");
        System.out.println();
        tree.preOrderTraversal(null);
        System.out.print(" >>> Pré ordem percurso");
        System.out.println();
        tree.simetricTraversal(null);
        System.out.print(" >>> Simétrico percurso");
        System.out.println();
        tree.levelOrderTraversal(null);
        System.out.print(" >>> Em nível percurso");
        System.out.println();

        List<Integer> list = new ArrayList<>();
        tree.borderLeftView(tree.root.left, 1, list);
        Collections.reverse(list);
        tree.maxLevel = 0;
        tree.borderRightView(tree.root, 1, list);

        for (Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.print("         >>> Somente a borda");
        System.out.println();

        int height = tree.height(null);
        System.out.println("Altura da arvore é: " + height);
        System.out.println();

    }
}
