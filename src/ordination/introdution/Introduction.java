package ordination.introdution;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Introduction {

    public static List<Product> filterNonNull(Product[] products) {
        return Arrays.stream(products).filter(Objects::nonNull).collect(Collectors.toList());
    }

    public static int searchCheaper(int[] numbers, int initial, int finish) {
        int cheaper = initial;
        for (int actual = initial; actual < finish; actual++) {
            if (numbers[actual] < numbers[cheaper]) {
                cheaper = actual;
            }
        }
        return cheaper;
    }

    public static void swap(int[] numbers, int first, int second) {
        int f = numbers[first];
        int s = numbers[second];
        numbers[first] = s;
        numbers[second] = f;
    }

    public static int searchMoreExpensive(List<Product> products, int finish) {
        int expensive = 0;
        for (int actual = 0; actual < finish; actual++) {
            if (products.get(actual).getPrice() > products.get(expensive).getPrice()) {
                expensive = actual;
            }
        }
        return expensive;
    }

    public static long finishAt(long inite) {
        return System.currentTimeMillis() - inite;
    }
}