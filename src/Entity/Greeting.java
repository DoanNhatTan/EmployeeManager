package Entity;

public class Greeting {
	private String message;

	public Greeting(String message) {
		super();
		this.message = message;
	}
	
	public void displayMessage() {
		System.out.println("Message: " + message);
	}
}
