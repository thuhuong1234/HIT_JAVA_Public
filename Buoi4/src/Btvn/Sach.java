package Btvn;

import java.util.Scanner;

public class Sach {
	
	private String MaSach, TenSach, TacGia, NhaXB;
	private int NamXB;

	public String getMaSach() {
		return MaSach;
	}

	public void setMaSach(String maSach) {
		MaSach = maSach;
	}

	public String getTenSach() {
		return TenSach;
	}

	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}

	public String getTacGia() {
		return TacGia;
	}

	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}

	public String getNhaXB() {
		return NhaXB;
	}

	public void setNhaXB(String nhaXB) {
		NhaXB = nhaXB;
	}

	public int getNamXB() {
		return NamXB;
	}

	public void setNamXB(int namXB) {
		NamXB = namXB;
	}

	public Sach() {
		MaSach = "";
		TenSach = "";
		TacGia = "";
		NhaXB = "";
		NamXB = 0;
	}

	public Sach(String maSach, String tenSach, String tacGia, String nhaXB, int namXB) {
	
		MaSach = maSach;
		TenSach = tenSach;
		TacGia = tacGia;
		NhaXB = nhaXB;
		NamXB = namXB;
	}

	public void nhap() {
		Scanner sach = new Scanner(System.in);
		System.out.println("Nhap mã sách:");
		MaSach = sach.nextLine();
		System.out.print("Nhập tên sách: ");
		TenSach = sach.nextLine();
		System.out.print("Nhập tên tác giả: ");
		TacGia = sach.nextLine();
		System.out.print("Nhập nhà xuất bản: ");
		NhaXB = sach.nextLine();
		System.out.print("Nhập năm xuất bản: ");
		NamXB = sach.nextInt();
	}

	public void xuat() {
		System.out.println(MaSach + "\t\t" + TenSach + "\t\t" + TacGia + "\t\t" + NhaXB + "\t\t" + NamXB);

	}

	public static void main(String[] args) {
		Sach[] list = new Sach[5];
		for (int i = 0; i < list.length; i++) {
			System.out.println("Nhập thông tin sách thứ :" + (i + 1));
			list[i] = new Sach();
			list[i].nhap();
		}
		
		System.out.println("Mã sách" + "\t\t" + "Tên sách" + "\t" + "Tác giả" + "\t\t" + "Nhà xuất bản" + "\t" + "Năm xuất bản");
		for (int i = 0; i < list.length; i++) {
			list[i].xuat();
		}
	}
}
