package Btvn;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int n;
		do {
			System.out.print("n = ");
			n = myObj.nextInt();
		} while (n <= 0);
		int count = 0;
		if (n > 2) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					count++;
			}
			if (count!=0) {
				System.out.print(n + "khong phai la so nguyen to");
				System.out.print("\nSo uoc la:" + (count + 2));
			} else {
				System.out.print(n + " la so nguyen to");
			}
		}
	}
}
