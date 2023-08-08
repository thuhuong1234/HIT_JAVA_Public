package Btvn;
import java.util.Scanner;
public class Bai4 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.print("Nhap a= ");
		float a = myObj.nextFloat();
		System.out.print("Nhap b= ");
		float b = myObj.nextFloat();
		System.out.print("Nhap c= ");
		float c = myObj.nextFloat();

		float delta = b * b - 4 * a * c;
		float x1;
		float x2;

		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));

			if (x1 < 0) {
				if (x2 < 0) {
					System.out.println("Phuong trinh vo nghiem");
				} else if (x2 == 0) {
					System.out.println("Phuong trinh co mot nghiem x=0");
				} else {
					System.out.println("Phuong trinh co hai nghiem");
					System.out.println("x1 = " + Math.sqrt(x1));
					System.out.println("x2 = " + (-Math.sqrt(x1)));
				}
			} else if (x1 == 0) {
				if (x2 < 0) {
					System.out.println("Phuong trinh co mot nghiem x=0");
				} else {
					System.out.println("Phuong trinh co ba nghiem");
					System.out.println("x1 = " + Math.sqrt(x1));
					System.out.println("x2 = " + (-Math.sqrt(x1)));
					System.out.println("x3 = 0");
				}
			} else {
				if (x2 < 0) {
					System.out.println("Phuong trinh co hai nghiem");
					System.out.println("x1 = " + Math.sqrt(x1));
					System.out.println("x2 = " + (-Math.sqrt(x1)));
				} else if (x2 == 0) {
					System.out.println("Phuong trinh co ba nghiem");
					System.out.println("x1 = " + Math.sqrt(x1));
					System.out.println("x2 = " + (-Math.sqrt(x1)));
					System.out.println("x3 = 0");
				} else {
					System.out.println("Phuong trinh co bon nghiem");
					System.out.println("x1 = " + Math.sqrt(x1));
					System.out.println("x2 = " + (-Math.sqrt(x1)));
					System.out.println("x3 = " + Math.sqrt(x2));
					System.out.println("x4 = " + (-Math.sqrt(x2)));
				}
			}
		} else if (delta == 0) {
			x1 = x2 = -b / (2 * a);

			if (x1 < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (x1 == 0) {
				System.out.println("Phuong trinh co mot nghiem x=0");
			} else {
				System.out.println("Phuong trinh co hai nghiem");
				System.out.println("x1 = " + Math.sqrt(x1));
				System.out.println("x2 = " + (-Math.sqrt(x1)));
			}

		} else {
			System.out.println("Phuong trinh vo nghiem");
		}
	}
}
