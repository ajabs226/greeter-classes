import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose a greeting: ");
		String greeting = scan.nextLine();
		
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		
		Greeter greeter = new Greeter(greeting);
		System.out.println(greeter.greet(name));
	
		JavaScriptGreeter javaScriptGreeter = new JavaScriptGreeter(greeting);
		System.out.println(javaScriptGreeter.greet(name));
		
		LoudGreeter loudGreeter = new LoudGreeter(greeting);
		System.out.println("How much volume to add? (0-10)");
		int volume = scan.nextInt();
		
		for(int i = 0; i < volume; i++) {
			loudGreeter.addVolume();
		}
		System.out.println(loudGreeter.greet(name));
		
		HtmlGreeter htmlGreeter = new HtmlGreeter(greeting);
		System.out.println(htmlGreeter.greet(name));
		


	}
	
}


