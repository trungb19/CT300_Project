package QuanTri;
import java.util.Scanner;

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
	  sv.themSV();
	  sv.dsSinhVien();
  }
	
  //Sửa sinh viên
  public void suaSV() {
	  sv.suaSinhVien();
	  sv.dsSinhVien();
  }
	
  //Xóa sinh viên
  public void xoaSV() {
	  sv.xoaSinhVien();
	  sv.dsSinhVien();
  }
	
	/*
	 * Chức năng quản lý học phần
	 */
  //Thêm học phần	
  public HocPhan[] themHP(HocPhan dshp[]) {
    Scanner sc = new Scanner(System.in);
		
	System.out.println("Nhập mã số học phần: ");
	String MaHP = sc.nextLine();
		
	System.out.println("Nhập tên học phần: ");
	String tenHP = sc.nextLine();
		
	System.out.println("Nhập số tín chỉ học phần: ");
	int soTC = sc.nextInt();
		
	HocPhan hp = new HocPhan(MaHP, tenHP, soTC);
		
    //copy các phần tử sang mảng mới
	HocPhan dshp1 [];
	dshp1 = new HocPhan[dshp.length + 1];
	for (int i = 0; i < dshp.length; i++) {
		dshp1[i] = new HocPhan();
		dshp1[i] = dshp[i];
	}
	dshp1[dshp.length] = new HocPhan(hp);
		
//		dshp = new HocPhan[dshp1.length];
//		for (int j = 0; j < dshp1.length; j++) {
//			dshp[j] = new HocPhan();
//			dshp[j] = dshp1[j];
//		}
	return dshp1;
  }
	
	//Sửa học phần
	public void suaHP() {
		
	}
	
	//Xóa học phần
	public void xoaHP() {
		
	}
	
  
  public void hienThiDanhSachSV() {
    sv.dsSinhVien();
  }
	
  public void hienThiDanhSachHP(HocPhan dshp[]) {
    System.out.format("|--------------------------------------------|\n");
	System.out.format("| %4s |         %12s         | %4s |\n", "MaHP", "Ten Hoc Phan", "soTC");
	System.out.format("|--------------------------------------------|\n");
	int i;
	for (i = 0; i < dshp.length; i++) {
	  hp.inHP(dshp[i]);
	// System.out.format("|--------------------------------------------|\n");
	}
	  System.out.format("|--------------------------------------------|\n");
  }
}
