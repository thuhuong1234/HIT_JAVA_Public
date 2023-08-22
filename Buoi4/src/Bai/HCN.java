package Bai;

public class HCN {
	private float CD,CR;
	
	public float getCD() {
		return CD;
	}
	public void setCD(float cD) {
		CD = cD;
	}
	public float getCR() {
		return CR;
	}
	public void setCR(float cR) {
		CR = cR;
	}
	public float ChuVi() {
		return (this.CD+this.CR)*2;
	}
	
	public float DienTich() {
		return this.CD*this.CR;
	}
	
	public static void main(String[] args) {
		HCN v1 = new HCN();
		float v=5.6;
		v1.setCD(v);
		v1.setCR(4.7);
		System.out.println("CV: "+v1.ChuVi());
		System.out.println("CV: "+v1.DienTich());
	}
}
//phthuc ChuVi, DienTich
//in ra cv dt
