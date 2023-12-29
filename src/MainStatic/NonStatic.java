package MainStatic;

import Entity.Greeting;

public class NonStatic {
// Bạn không thể trực tiếp gọi một phương thức không static(non-static) từ một phương thức static
	
	public static void main(String[] args) {
		Greeting greeting = new Greeting("Hellow, World!"); // Tạo đối tượng của lớp Greeting
		greeting.displayMessage(); // gọi phương thức non-static displayMessage() thông qua đối tượng
	}
}
