package hello_oop;

public class Main {

	public static void main(String[] args) {
		Greeter g = new Greeter("David Nowak", "Ferrets Should Rule the World!!");
        System.out.println(g.format());
        
        Greeter mickey = new Greeter("Mickey Mouse", "Life is Wonderful!");
        System.out.println(mickey.format());
	}
}
