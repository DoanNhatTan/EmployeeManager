package MainStatic;

import Entity.Manager;

public class BasicConcept {
//	https://rikkei.edu.vn/static-trong-java/#:~:text=Trong%20Java%2C%20t%E1%BB%AB%20kh%C3%B3a%20static,m%E1%BB%9Bi%20%C4%91%E1%BB%83%20truy%20c%E1%BA%ADp%20n%C3%B3.
	
//	+ Từ khóa static được sử dụng để chỉ ra rằng một thành phần thuộc về lớp chứa nó
//	Chứ không phải thuộc về một đối tượng cụ thể nào của lớp.
//  + Điều này có nghĩa là các đối tượng của lớp chia sẻ chung một bản sao thành phần 
//	satatic và không cần phải tạo đối tượng để truy cập nó

// là một thành phần thuộc về lớp chưa nó chứ không thuộc về một đối tượng
	
	// biến static
	public static int myStaticVarible = 10;
	
	// phuong thức static
	public static void myStaticMethod() {
		System.out.println("this is a static method");
	}
	public void noStaticMethod() {
		System.out.println("this is not a static method");
	}
	
	public static void main(String[] args) {
		// không cần tạo đối tượng để truy cập biến static
		System.out.println("Static Variable" + BasicConcept.myStaticVarible);
		
		// tạo đối tượng để gọi phương thức mà không cần static
		BasicConcept obj = new BasicConcept();
		obj.noStaticMethod();
	}
	
}
