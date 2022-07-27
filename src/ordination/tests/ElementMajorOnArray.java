package ordination.tests;

import java.util.HashMap;

public class ElementMajorOnArray {
    public static void main(String[] args) {

        int[] array = {2, 1, 1};

        var control = new HashMap<Integer, Integer>();
        var repeats = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                control.put(array[i], i);
                continue;
            }

            var contains = control.containsKey(array[i]);

            if (contains) {
                var existRepeat = repeats.containsKey(array[i]);

                if (existRepeat) {
                    var value = repeats.get(array[i]);
                    repeats.replace(array[i], value + 1);
                } else {
                    repeats.put(array[i], 2);
                }
            } else {
                control.put(array[i], i);
            }
        }

        System.out.println(repeats.keySet());
    }
}
