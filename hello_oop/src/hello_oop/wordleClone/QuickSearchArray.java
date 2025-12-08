package clone_wordle;

import java.util.Arrays;
import java.util.Random;

public class QuickSearchArray {
    private final String[] words;
    private final Random rand = new Random();

    public QuickSearchArray(String[] source) {
        this.words = new String[source.length];
        for (int i = 0; i < source.length; i++) {
            this.words[i] = source[i].toLowerCase();
        }
        Arrays.sort(this.words);
    }

    public boolean contains(String w) {
        if (w == null || w.length() != 5) return false;
        return Arrays.binarySearch(words, w.toLowerCase()) >= 0;
    }

    public String getRandom() {
        return words[rand.nextInt(words.length)];
    }
}
