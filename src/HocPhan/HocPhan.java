package HocPhan;

public class HocPhan {
	private String MaHP;
//	private String MaHP[];
	private String tenHP;
	private int soTC;
	
	
	public void init(HocPhan dshp[]) {		
		dshp[0] = new HocPhan("CT112", "Mạng máy tính", 3);
		dshp[1] = new HocPhan("CT275", "Công nghệ web", 3);
		dshp[2] = new HocPhan("CT467", "Quản trị dữ liệu", 3);
		dshp[3] = new HocPhan("CT300", "Phát triển phần mềm", 3);
		dshp[4] = new HocPhan("CT178", "Nguyên lý hệ điều hành", 3);
		dshp[5] = new HocPhan("CT296", "Phân tích thiết kế HTTT", 3);
		dshp[6] = new HocPhan("CT294", "Máy học ứng dụng", 3);
		dshp[7] = new HocPhan("CT222", "An toàn hệ thống", 3);
		dshp[8] = new HocPhan("CT182", "Ngôn ngữ mô hình hóa", 3);
		dshp[9] = new HocPhan("CT176", "Lập trình hướng đối tượng", 3);
	}
	
	public HocPhan() {
////		MaHP = new String[100];
//		MaHP = new String();
//		//Khởi tạo 1 số học phần
//		int i;
//		String chuoi = new String();
//		for (i = 0; i < 10; i++) {
//			chuoi = "CT11"+i;
//			MaHP[i] = new String(chuoi);
//		}
		
		MaHP = new String();
		tenHP = new String();
		soTC = 3;
	}
	public HocPhan(String MaHP, String TenHP, int soTC) {
		this.MaHP = MaHP;
		this.tenHP = TenHP;
		this.soTC = soTC;
	}
	
	public HocPhan(HocPhan hp) {
		this.MaHP = hp.MaHP;
		this.tenHP = hp.tenHP;
		this.soTC = hp.soTC;
	}
	
	//Sửa đổi mã HP
	public void setHP() {
		
	}
	public void themHP(HocPhan hp) {
		 this.MaHP = hp.MaHP;
		 this.tenHP = hp.tenHP;
		 this.soTC = hp.soTC;
	}
	
	
	//Lấy mã học phần
	public String getHP() {
		return MaHP;
	}
	
	//Xóa học phần
	public void xoaHP() {
		
	}
	
	public void inHP(HocPhan hp) {
//		System.out.println(MaHP[i]+"\n");
//		System.out.format("|------------------------------------------|\n");
		System.out.format("|%-6s|%-30s|%6d|\n", hp.MaHP, hp.tenHP, hp.soTC);
	}
}
