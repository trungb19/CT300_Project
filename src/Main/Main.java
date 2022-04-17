package Main;

import java.util.Scanner;

import HocPhan.HocPhan;
import QuanTri.QuanTri;
import SinhVien.SinhVien;

public class Main {

	public static void main(String[] args) {
		//tạo một danh sách 10 đối tượng học phần:		
		HocPhan dshp[]; 
		dshp = new HocPhan[10];
		
		//khởi tạo các thông tin cho học phần.
		HocPhan hp = new HocPhan();
		hp.init(dshp);
		

		/*
		 * Chọn vai trò người dùng
		 * Quản trị: 1
		 * Sinh Viên: 2
		 */
		System.out.println("Chọn vai trò: ");
		System.out.println("Quản trị: 1");
		System.out.println("Sinh viên: 2");
		int quyen;
		Scanner sc = new Scanner(System.in);
		quyen = sc.nextInt();
		
		/*
		 * Chức năng quản trị
		 */
		if (quyen == 1) {
			QuanTri qt = new QuanTri();
			System.out.println("\nVui lòng chọn chức năng");
			System.out.println("\n1. Thêm sinh viên");
			System.out.println("\n2. Sửa sinh viên");
			System.out.println("\n3. Xóa sinh viên");
			System.out.println("\n4. Thêm sinh HP");
			System.out.println("\n5. Sửa sinh HP");
			System.out.println("\n6. Xóa sinh HP\n");
			System.out.println("\n7. Hiển thị danh sách sinh viên\n");
			System.out.println("\n8. Hiển thị danh sách học phần\n");
			int chucnang = sc.nextInt();
			if (chucnang==1) {
				qt.themSV();
//				qt.hienThiDanhSachSV();
			}
			if (chucnang==2) {
				qt.suaSV();
			}
			if (chucnang==3) {
				qt.xoaSV();
			}
			if (chucnang==4) {
				dshp = qt.themHP(dshp);
				System.out.println();
//				qt.hienThiDanhSachHP(dshp);
			}
			if (chucnang==5) {
				
			}
			if (chucnang==6) {
				
			}
			if (chucnang==7) {
				qt.hienThiDanhSachSV();
			}
			if (chucnang==8) {
				//hiển thị danh sách các học phần.				
				qt.hienThiDanhSachHP(dshp);
			}
		}
		
		/*
		 * Chức năng sinh viên
		 */
		if (quyen == 2) {
			SinhVien sv = new SinhVien();
			System.out.println("\nVui lòng chọn chức năng");
			System.out.println("\n1. Tìm kiếm HP");
			System.out.println("\n1. Thêm HP");
			int chucnang = sc.nextInt();
			if (chucnang==1) {
				
			}
			if (chucnang==2) {
				
			}
			if (chucnang==3) {
				
			}
		}
	}

}
