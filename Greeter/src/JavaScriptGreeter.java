
class JavaScriptGreeter extends Greeter {

	public JavaScriptGreeter(String greeting) {
		super(greeting);
	
	}
	
	@Override
	public String toString() {
		return "Simon Says: " + greeting ;
	}

	public String greet(String name) {
		return ("Simon says, \"" + super.greet(name) + "\"");
	}

}
