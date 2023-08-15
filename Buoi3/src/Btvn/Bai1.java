package Btvn;

public class Bai1
{
	public static void main(String[] args) {
	
		int[] a = {1, 2, 3, 1,3,2,3};

		int count1 =0, count2 =0, count3 =0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1)	count1++;
			if(a[i]==2)	count2++;
			if(a[i]==3) count3++;
		}
		System.out.println("So 1 xuat hien : "+ count1+" lan");
		System.out.println("So 2 xuat hien : "+ count2+" lan");
		System.out.println("So 3 xuat hien : "+ count3+" lan");
	}
}
