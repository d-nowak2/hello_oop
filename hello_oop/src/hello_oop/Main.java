package hello_oop;

public class Main {

	public static void main(String[] args) {
		Greeter g = new Greeter("David Nowak", "Ferrets Should Rule the World!");
        System.out.println(g.format());
	}

}
