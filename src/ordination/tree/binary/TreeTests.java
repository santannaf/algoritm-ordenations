package ordination.tree.binary;

import ordination.tree.Node;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TreeTests {
    public static void main(String[] args) {
        int n = ThreadLocalRandom.current().nextInt(100, 105);
        var tree = new BinaryTree(n);

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

        System.out.println("=======================================================================");
        System.out.println("===== Árvore de busca binária =====");

        int[] numbers = new int[12];

        var random = new Random();
        random.setSeed(77);

        for (int i = 0; i < 12; i++) {
            int number = random.nextInt(50);;
            numbers[i] = number;
        }

        System.out.println("Array gerado automaticamente: " + Arrays.toString(numbers));

        var binaryTreeSearch = new BinarySearchTree();
        for (Integer i : numbers) {
            binaryTreeSearch.insert(i);
        }

        binaryTreeSearch.simetricTraversal(null);
        System.out.print(" >>> Simétrico percurso");
        System.out.println();

        int[] forSearch = {4, 60, 40, 22, 14, 63, 98, 30, 31};

        for (int i : forSearch) {
            var x = binaryTreeSearch.search(i, binaryTreeSearch.root);
            if (x == null) System.out.printf("%s não encontrado", i);
            else System.out.printf("%s encontrado", i);
            System.out.println();
        }

        List<Integer> list2 = new ArrayList<>();
        binaryTreeSearch.borderLeftView(binaryTreeSearch.root.left, 1, list2);
        Collections.reverse(list2); // OPERAÇÃO CONSTANTE, SOMENTE FAZ A TROCA DE POSIÇÃO DOS ELEMENTOS
        tree.maxLevel = 0;
        binaryTreeSearch.borderRightView(binaryTreeSearch.root, 1, list2);

        System.out.println("O maior elemento é: " + list2.get(list2.size() - 1));
        System.out.println("O menor elemento é: " + list2.get(0));
        System.out.println();

        var min = binaryTreeSearch.min(null);
        var max = binaryTreeSearch.max(null);
        System.out.println("O mínimo é: " + min.data);
        System.out.println("O máximo é: " + max.data);
        System.out.println();

        int v = 27;
        binaryTreeSearch.remove(v, null);
        binaryTreeSearch.levelOrderTraversal(null);
        System.out.println();

    }
}
