package Btvn;

import java.util.Scanner;

public class HCN {
	Scanner hcn = new Scanner(System.in);
	private int CD, CR;

	public int getCD() {
		return CD;
	}

	public void setCD(int cD) {
		CD = cD;
	}

	public int getCR() {
		return CR;
	}

	public void setCR(int cR) {
		CR = cR;
	}

	public HCN() {
		CD = 0;
		CR = 0;
	}

	public HCN(int CD,int CR) {
		this.CD=CD;
		this.CR= CR;
	}
	public void nhap() {
		System.out.print("Nhap chieu dai:");
        CD = hcn.nextInt();
        System.out.print("Nhap chieu rong:");
        setCD(CD);
        CR = hcn.nextInt();
        setCR(CR);
	}
	public void veHCN() {
		for(int i =0; i <this.CD; i++) {
			for(int j=0; j<this.CR;j++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
	}
	public int dienTich() {
		int S = this.CD*this.CR;
		return S;
	}
	public int chuVi() {
		int P = (this.CD+this.CR)*2;
		return P;
	}
	public static void main(String[] args) {
		HCN h1 = new HCN();
		h1.nhap();
		h1.veHCN();
		System.out.println("Dien tich :"+h1.dienTich());
		System.out.println("Chu vi :"+h1.chuVi());
	}
}
