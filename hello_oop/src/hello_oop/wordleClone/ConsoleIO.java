public class ConsoleIO {
    package clone_wordle;

import java.util.Scanner;

public class ConsoleIO {
    private final Scanner in = new Scanner(System.in);

    public void say(String msg) {
        System.out.println(msg);
    }

    public String ask(String prompt) {
        System.out.print(prompt + " ");
        return in.nextLine().trim();
    }

    public void close() {
        in.close();
    }
 }
}
