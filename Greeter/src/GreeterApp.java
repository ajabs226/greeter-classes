import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose a greeting: ");
		String userGreet = scan.nextLine();
		
		System.out.println("Enter your name: ");
		String userName = scan.nextLine();
		
		Greeter greeter = new Greeter(userGreet);
		System.out.println(greeter.greet(userName));
	
		JavaScriptGreeter javaScriptGreeter = new JavaScriptGreeter(userGreet);
		System.out.println(javaScriptGreeter.greet(userName));

	}
	
}


