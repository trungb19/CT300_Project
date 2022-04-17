package QuanTri;
import HocPhan.HocPhan;
import SinhVien.SinhVien;

public class QuanTri {
	private String MaCB;
	
	public QuanTri() {
		MaCB = "001";
	}
	/*
	 * Chức năng quản lý sinh viên
	 */
	SinhVien sv = new SinhVien();
	HocPhan hp = new HocPhan();
	
	//Thêm sinh viên mới
	public void themSV() {
		
	}
	
	//Sửa sinh viên
	public void suaSV() {
		
	}
	
	//Xóa sinh viên
	public void xoaSV() {
		
	}
	
	/*
	 * Chức năng quản lý học phần
	 */
	//Thêm học phần
	public void themHP() {
		hp.themHP();
	}
	
	//Sửa học phần
	public void suaHP() {
		hp.suaMaHP();
	}
	
	//Xóa học phần
	public void xoaHP() {
		hp.xoaHP();
	}
	
	//Tìm học phần
	public void timMaHP() {
		hp.timMaHP();
	}
	
	
	/*
	public void hienThiDanhSachSV() {
		int i;
		for (i = 0; i < 10; i++)
			sv.in(i);
	}
	
	public void hienThiDanhSachHP() {
		hp.inDanhSachHP();
	}
	*/
}
