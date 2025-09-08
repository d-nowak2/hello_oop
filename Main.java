package hello_oop;

public class Main {

	public static void main(String[] args) {
		Greeter g = new Greeter("David Nowak", "Ferrets Should Rule the World!!");
        System.out.println(g.format());
        
        Greeter mickey = new Greeter("Mickey Mouse", "Life is Wonderful!");
        System.out.println(mickey.format());
		
        Greeter westley = new Greeter("Westley Keever", "Don't forget your semicolon;");
        System.out.println(westley.format());
		
        Greeter newGreeter = new Greeter("Bret Evenson","GO BEARS!!!!!");
        System.out.println(newGreeter.format());

        Greeter drew = new Greeter("Drew Struensee", "Hello word");
        System.out.println(drew.format());
	}
}
