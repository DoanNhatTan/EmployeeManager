package MainStatic;

import Entity.MathHelper;

public class StaticMethods {
//	Phương thức tĩnh (static method) là một loại phương thức trong lập trình hướng đối tượng mà không yêu cầu tạo
//	đối tượng của lớp để gọi nó
	
//	Lý do sử dụng
//	++ thực hiện các hành động không liên quan đến đối tượng
//	++ tạo các tiện ích (utility) và hàm trợ giúp (helper) chung
//	++ được sử dụng để tạo các "factory method" : đây là các phương thức chịu trách nhiệm tào ra các đối tượng mới dựa trên các tham số đầu vào (factory Method được định nghĩa trong lớp cơ sở hoạc interface)
//	++ xây dựng phương thức main
//	cần đọc qua lưu ý
	
	public static void main(String[] args) {
		int sum = MathHelper.add(3, 5); // sự dung phương thức static add() mà không cần khởi tạo đối tượng;
		int product = MathHelper.multiply(3, 5); // sử dụng phương thức static multiply()
		
		System.out.println("tổng của 3 và 5 là: "+ sum); // kết quả là 8
		System.out.println("tích của 3 và 5 là: "+ product); // kết quả là 15
	}
}
