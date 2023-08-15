package Btvn;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner b2 = new Scanner(System.in);
		int n;
		System.out.print("n = ");
		n = b2.nextInt();
		int[] a = new int[n];
		int[] b = new int[n + 1];
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = b2.nextInt();
		}

		System.out.println("Mang vua nhap:");
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.print(a[i] + " ");
		}

		int vt;
		do {
			System.out.println("\nNhap vi tri can chen/xoa:");
			vt = b2.nextInt();
		} while (vt < 0 || vt > n);

		System.out.println("\nGia tri can chen:");
		int k = b2.nextInt();

		Them(vt, k, b);
		System.out.println("Mang vua chen:");
		Xuat(b);

		
		System.out.println("\nMang vua xoa:");
		Xoa(vt,a);
	}

	static void Them(int vt, int k, int[] b) {
		for (int i = b.length - 1; i >= vt; i--) {
			b[i] = b[i - 1];
		}
		b[vt-1] = k;

	}

	static void Xoa(int vt, int[] a) {
		for (int i = vt-1; i < a.length - 1; i++) {
			a[i] = a[i+1];
		}
		int[] c = new int[a.length-1];
		for (int i = 0; i < a.length - 1; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

	static void Xuat(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
