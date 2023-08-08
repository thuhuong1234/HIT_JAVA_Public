package Btvn;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int n;
		do {
			System.out.print("n = ");
			n = myObj.nextInt();
		}while(n<=0);
		
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (j == 0 || i == 0 || j == n - 1 || i == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}
}
