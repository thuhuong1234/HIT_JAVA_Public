package Btvn;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner b4 = new Scanner(System.in);

		System.out.println("Mang chuoi:");
		String originalStr = b4.nextLine();
		System.out.println("OriginalStr string: " + originalStr);
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}
		
		System.out.println("Reversed string: " + reversedStr);
		
		if(originalStr.equals(reversedStr)) {
			System.out.println("Chuoi doi xung");
		}else {
			System.out.println("Chuoi khong doi xung");
		}
		

	}

}
