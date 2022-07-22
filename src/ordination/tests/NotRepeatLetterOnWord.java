package ordination.tests;

import ordination.introdution.Introduction;

import java.util.ArrayList;
import java.util.HashMap;

public class NotRepeatLetterOnWord {
    public static void main(String[] args) {
        String word = "abracadabraratibumouviramdoipirangacasacaiuqualquerum";
        char[] split = word.toCharArray();

        long startAt = System.currentTimeMillis();

        String s = firstCharacterNotRepeat(split);
        System.out.println("==================================================================================");
        System.out.printf("Resp: %s | Duration %s", s, Introduction.finishAt(startAt) + " ms");
        System.out.println();
        System.out.println("==================================================================================");
        System.out.println();
    }

    private static String firstCharacterNotRepeat(char[] words) {
        var repeats = new HashMap<Character, Integer>();
        var notRepeats = new ArrayList<Integer>();
        var readControl = new HashMap<Character, Integer>();

        if (words.length == 1) return String.valueOf(words[0]);
        if (words.length <= 0) return "Inválido";

        for (int i = 0; i < words.length; i++) {
            Character character_word = words[i];

            if (i == 0) {
                notRepeats.add(i);
                readControl.put(character_word, i);
                continue;
            }

            boolean contains = readControl.containsKey(character_word);

            if (contains) {
                var value = readControl.get(character_word);
                var inRepetidos = repeats.containsKey(character_word);

                if (inRepetidos) {
                    var count = repeats.get(character_word) + 1;
                    repeats.replace(character_word, count);
                } else {
                    repeats.put(character_word, 2);
                }

                notRepeats.remove(value);
            } else {
                notRepeats.add(i);
                readControl.put(character_word, i);
            }
        }

        if (notRepeats.size() == 0) return "_";

        return String.valueOf(words[notRepeats.get(0)]);
    }
}