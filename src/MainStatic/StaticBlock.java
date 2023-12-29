package MainStatic;

import Entity.Database;

public class StaticBlock {
//	Chúng ta sử dụng khối static để khởi tạo các biến static
//	Ngoài ra, nếu các biến static cần thêm logic đa câu lệnh trong quá trình khởi tạo, chúng ta cỏ thế sử dụng khối static
	
	public static void main(String[] args) {
		// Khi lớp Database được nạp, khối static sẽ được thực thi
		String connectionString = Database.getConnectionString();
		System.out.println("Chuỗi kết nối: " + connectionString);
	}
}
