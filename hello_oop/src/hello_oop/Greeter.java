package hello_oop;

public class Greeter {
    private final String name;
    private final String message;

    public Greeter(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String format() {
        return "Hello, I'm " + name + ". " + message;
    }
}
