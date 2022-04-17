package SinhVien;

import java.util.Scanner;

import HocPhan.HocPhan;

public class SinhVien {
	//Access Modifier
		private String masv[], hten[];
		private HocPhan hp[];
		
		//Constructor
		public SinhVien() {
			masv = new String[100];
			hten = new String[100];
			hp = new HocPhan[100];
			//Khởi tạo 1 số sinh viên
			int i;
			for (i = 0; i < 10; i++) {
				masv[i] = new String("maSV" + i);
				hten[i] = new String("tenSV" +i); //Chỗ này có thể điền tên vào
			}
		}
		
		//Cac phuong thuc khac		
		//In ra sinh viên thứ i
		public void in(int i) {
			System.out.print("["+masv[i]+","+hten[i]+"]\n");
		}
		
		public String toString() {
			return "0";
		}
		
		public String timKiem() {
			return "Yes";
		}
		
		//Đăng ký học phần
		public void dky(String mon) {
			
		}
		
		//Xóa học phần đã đăng ký
		public void xoa(String mon) {
			
		}
		
		public String layTen() {
			return "0";
		}
		
	
}
