package Btvn;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner b3 = new Scanner(System.in);
		int n;
		System.out.print("n = ");
		n = b3.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = b3.nextInt();
		}

		System.out.println("Mang vua nhap:");
		Xuat(a);

		System.out.println("Mang sap xep tang:");
		SapXep(a);
	}

	static void Xuat(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void SapXep(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tg;
					tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
			}
		}
		Xuat(a);
	}
}
