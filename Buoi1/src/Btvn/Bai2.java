package Btvn;

import java.util.Scanner;

public class Bai2 {
	static int luyThua(int n) {
		int lt =1;
	    for(int i =1; i<=n; i++) {
	    	lt*=i;
	    }
	    return lt;
	  }
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int n;
		do {
			System.out.print("n = ");
			n = myObj.nextInt();
		}while(n<=0);
		float S=0 ,P =0;
		for(int i =1; i<=n; i++) {
			S+=(float)1/i;
			P+=luyThua(i);
		}
		System.out.printf("Tong S = "+S);
		System.out.printf("\nTong P = "+P);
	}
}
