package clone_wordle;

public class GuessWord {
    public static final int SAME_SCORE = 5;
    private final String guess;
    private final char[] marks;

    public GuessWord(String guess) {
        this.guess = guess.toLowerCase();
        this.marks = new char[5];
    }

    public int evaluateWordScore(String secret) {
        secret = secret.toLowerCase();
        int greens = 0;
        int[] freq = new int[26];

        for (int i = 0; i < 5; i++) {
            freq[secret.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 5; i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                marks[i] = 'G';
                greens++;
                freq[guess.charAt(i) - 'a']--;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (marks[i] == 'G') continue;
            int idx = guess.charAt(i) - 'a';
            if (idx >= 0 && idx < 26 && freq[idx] > 0) {
                marks[i] = 'Y';
                freq[idx]--;
            } else {
                marks[i] = 'B';
            }
        }
        return greens;
    }

    public String getGuess() {
        return guess;
    }

    public char[] getMarks() {
        return marks;
    }
}
