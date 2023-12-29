package Entity;

public class OuterClass {
	private static String staticMessage = "Hello from static member of OuterClass";
	
	// Lớp con static
	public static class StaticNestedClass{
		public void displayMessge() {
			System.out.println(staticMessage); // Truy cập biến static của lớp bên ngoài
		}
	}
}
