package MainEmloyee;

import java.util.ArrayList;
import java.util.Scanner;

import Entity.Staff;

public class RunMainEmloyeeManager {

	public static void main(String[] args) {
		ArrayList<Staff> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int so;
		while (true) {
			System.out.println("------------------------Menu-----------------------------");
			System.out.println("1: Nhập danh sách nhân viên từ bàn phím");
			System.out.println("2: Xuất danh sách nhân viên ra màn hình");
			System.out.println("3: Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
			System.out.println("4: Xóa nhân viên theo mã nhập từ bàn phím");
			System.out.println("5: Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
			System.out.println("6: Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
			System.out.println("7: Sắp xếp nhân viên theo họ và tên");
			System.out.println("8: Sắp xếp nhân viên theo thu nhập");
			System.out.println("9: Xuất 5 nhân viên có thu nhập cao nhất");
			System.out.println("Nhap vao 1-9 de chon chuong trinh: ");
			so = sc.nextInt();

			switch (so) {
			case 1:
				System.out.println("Nhập danh sách nhân viên từ bàn phím");
				break;
			case 2:
				System.out.println("Xuất danh sách nhân viên ra màn hình");
				break;
			case 3:
				System.out.println("Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
				break;
			case 4:
				System.out.println("Xóa nhân viên theo mã nhập từ bàn phím");
				break;

			case 0:
				return;
			default:
				throw new AssertionError();
			}
		}

	}

}
