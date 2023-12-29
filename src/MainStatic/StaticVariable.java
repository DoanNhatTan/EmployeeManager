package MainStatic;

import Entity.Vehicle;

public class StaticVariable {
	
	//Lý do sự dụng biến static
	// ++ Chia sẻ dữ liệu giữa các đối tượng
	// ++ Định nghĩa các hằng số  (hằng số là một giá trị không thay đổi suốt qua trình thực thi của chương trình)
	// ++ tiết kiệm bộ nhớ
	// ++ Theo dõi số lượng đối tượng được tạo ra
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car");
		Vehicle motorbike = new Vehicle("Motorbike");

		// In ra tổng số phương tiện thông qua phương thức static getTotalVehicles mà không cần khởi tạo đối tượng
		// là thành phần của class Vehicle biến này dùng chung cho cả class vehicle
		System.out.println("Tổng số phương tiện: " + Vehicle.getTotalVehicles()); // Kết quả: 2
	}
}
