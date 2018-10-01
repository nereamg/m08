public class SayHelloTo {

	private String name = "";

	public SayHelloTo(String myName) {
		this.name = myName;
	}

	public String helloTo() {
		return "Bye " + this.name + "!";
	}
}
