import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterAppTest {

	@Test
	void testGreeting1() {
		Greeter test1 = new Greeter("Hello");
		String expected = "Hello, Patrick!";
		String actual = test1.greet("Patrick");
		assertEquals(expected, actual);
	}
	
	@Test
	void testGreeting2() {
		Greeter test2 = new Greeter("'Sup");
		String expected = "'Sup, Paul!";
		String actual = test2.greet("Paul");
		assertEquals(expected, actual);
	}
	
	@Test
	void testJavaScriptGreeter1() {
		JavaScriptGreeter test3 = new JavaScriptGreeter("Hi");
		String expected = "Simon says, \"Hi, Tabitha!\"";
		String actual = test3.greet("Tabitha");
		assertEquals(expected, actual);
	}

	@Test
	void testJavaScriptGreeter2() {
		JavaScriptGreeter test4 = new JavaScriptGreeter("Cherio");
		String expected = "Simon says, \"Cherio, Kate!\"";
		String actual = test4.greet("Kate");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLoudGreeter1() {
		LoudGreeter test5 = new LoudGreeter("What's up");
		String expected = "What's up, Greg!!";
		String actual = test5.greet("Greg");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLoudGreeter2() {
		LoudGreeter test6 = new LoudGreeter("Waazzzaaaapphh");
		String expected = "Waazzzaaaapphh, Napoleon!!";
		String actual = test6.greet("Napoleon");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLoudGreeter3() {
		LoudGreeter test7 = new LoudGreeter("Hola");
		test7.addVolume();
		test7.addVolume();
		String expected = "Hola, Mason!!!!";
		String actual = test7.greet("Mason");
		assertEquals(expected, actual);
	}

	@Test
	void testHtmlGreeter1() {
		HtmlGreeter test8 = new HtmlGreeter("Hey");
		String expected = "<h1>Hey, Leslie!</h1>";
		String actual = test8.greet("Leslie");
		assertEquals(expected, actual);
	}

	@Test
	void testHtmlGreeter2() {
		HtmlGreeter test9 = new HtmlGreeter("Hello there", "h3");
		String expected = "<h3>Hello there, captain!</h3>";
		String actual = test9.greet("captain");
		assertEquals(expected, actual);
	}
	
	@Test
	void testHtmlGreeter3() {
		HtmlGreeter test10 = new HtmlGreeter("Hey", "h2");
		String expected = "<h2>Hey, Benjamin!</h2>";
		String actual = test10.greet("Benjamin");
		assertEquals(expected, actual);
	}
	
	
	
	
	
	
	
	
	
	

}
