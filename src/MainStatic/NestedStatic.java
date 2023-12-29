package MainStatic;

import Entity.OuterClass;

public class NestedStatic {
//	Lớp con static, còn được gọi lớp con dạng nested static
//	Là một lớp được định nghĩa bên tron một lớp cha và được đánh dấu với từ khóa static
	
//	Lý do sử dụng
//	++ Tăng tính đóng gói
//	++ Tăng khả năng đọc và bảo trì mã
//	++ Tối ưu hóa bộ nhớ
	
	public static void main(String[] args) {
//		Tạo đối tượng của lớp con static
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		
//		Gọi phương thức displayMessage() của lớp con static
		nestedObject.displayMessge(); // Kết quả: Hello from static member of OuterClass!
	}

}
