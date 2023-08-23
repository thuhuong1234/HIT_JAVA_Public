package Btvn;

import java.util.Scanner;

public class SinhVien {
	private String maSV, hoTen;
	private float diemToan, diemLy, diemHoa;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public SinhVien() {
		this.maSV = "";
		this.hoTen = "";
		this.diemToan = 0;
		this.diemLy = 0;
		this.diemHoa = 0;
	}
	public SinhVien(String maSV, String hoTen, float diemToan, float diemLy, float diemHoa) {
		
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	public float diemTB() {
		return (this.diemToan+this.diemLy+this.diemHoa)/3;
	}
	public void nhap() {
		Scanner sv = new Scanner(System.in);
		System.out.println("Nhập mã SV:");
		maSV = sv.nextLine();
		System.out.println("Nhập họ tên SV:");
		hoTen = sv.nextLine();
		System.out.println("Nhập điểm Toán:");
		diemToan = sv.nextFloat();
		System.out.println("Nhập điểm Lý:");
		diemLy = sv.nextFloat();
		System.out.println("Nhập điểm Hóa:");
		diemHoa = sv.nextFloat();
	}
	public void xuat() {
		System.out.println(maSV+"\t\t"+hoTen+"\t\t"+diemToan+"\t\t"+diemLy+"\t\t"+diemHoa+"\t\t"+diemTB());
	}
	public static void main(String[] args) {
		SinhVien[] list = new SinhVien[3];
		for (int i = 0; i < list.length; i++) {
			System.out.println("Nhập thông tin sv thứ :" + (i + 1));
			list[i] = new SinhVien();
			list[i].nhap();
		}
		
		System.out.println("Mã SV" + "\t\t" + "Họ Tên" + "\t\t" + "Điểm Toán" + "\t\t" + "Điểm Lý" + "\t\t" + "Điểm Hóa"+"\t\t"+"Điểm TB");
		for (int i = 0; i < list.length; i++) {
			list[i].xuat();
		}
	}
}
