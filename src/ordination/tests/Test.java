package ordination.tests;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Test {

    public static void main(String[] args) {

        System.out.println("Para entrada de: " + Arrays.toString(new String[]{"3", "6"}));
        System.out.println(">>> " + possibilities("6", "1"));

        System.out.println("Para entrada de: " + Arrays.toString(new String[]{"2", "1"}));
        System.out.println(">>> " + possibilities("2", "1"));

        System.out.println("Para entrada de: " + Arrays.toString(new String[]{"3", "3", "2", "1", "0"}));
        System.out.println(">>> " + possibilities("3", "3", "2", "1", "0"));

        System.out.println("Para entrada de: " + Arrays.toString(new String[]{"2", "1", "2", "1", "5", "4", "5"}));
        System.out.println(">>> " + possibilities("2", "1", "2", "1", "5", "4", "5"));
    }

    private static int possibilities(String... arg) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        int total = 0;

        while (!stack.isEmpty()) {

            int i = stack.pop();

            while (i < arg.length && arg[i].contains("3456789")) {
                i++;
            }

            if (i < arg.length && arg[i].equals("0")) continue;

            if (i >= arg.length - 1) {
                total++;
            } else {
                if (Integer.parseInt(arg[i] + arg[i + 1]) <= 26) {
                    stack.add(i + 1);
                    stack.add(i + 2);
                } else {
                    stack.add(i + 1);
                }
            }
        }

        return total;
    }
}
