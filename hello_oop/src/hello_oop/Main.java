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

		Greeter andresBodington = new Greeter("Andres Bodington", "Max Verstappen is the GOAT!");
        System.out.println(andresBodington.format());

        Greeter drew = new Greeter("Drew Struensee", "Hello word");
        System.out.println(drew.format());

		Greeter marcus = new Greeter("Marcus Guerrero","Hello World");
        System.out.println(marcus.format());
        
        Greeter joshua = new Greeter("Joshua Waters", "Penguins are awesome!");
        System.out.println(joshua.format());

        Greeter saleh = new Greeter("Saleh Yahya", "Hello word");
        System.out.println(saleh.format());
    
        Greeter Isaac = new Greeter("Isaac Joseph", "Word hard as you can and the world is yours");
        System.out.println(Isaac.format());
        
        Greeter alicia = new Greeter("Alicia Wasik", "Hello world");
        System.out.println(alicia.format());
        Greeter isary = new Greeter("Isary Lopez", "It's Pumpkin Spice Season");
        System.out.println(isary.format());

        Greeter Abdu = new Greeter("Abdulrahman Khan", "kuch bhi");
        System.out.println(Abdu.format());
	}
}
