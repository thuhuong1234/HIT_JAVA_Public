package Buoi1;

import java.util.Scanner;

public class JAVA_PUBLIC {
	public static void main(String[] args) {
		// xuat
		// System.out.print("Hello MaiLinh");
		// nhap
		Scanner myObj = new Scanner(System.in);

		// Read user input
//		 // Output user input

//		 System.out.println("\nEnter username");
//		 String userName = myObj.nextLine();  
//		 
//		 System.out.println("\nEnter age:"); 
//		 int age = myObj.nextInt();
//		 
//		 System.out.println("\nEnter salary:");
//		 double salary = myObj.nextDouble();
//		 
//		 //lay ra tung ki tu
//		 System.out.println("\nEnter c:");
//		 
//		 char c = myObj.next().charAt(2);
//		 
//          // here this is the indexing of the element to take //
//		  System.out.println("c = "+c);
//		  
//		 // Output input by user 
//		 System.out.println("\nUsername is: " + userName); 
//		 System.out.println("Age: " + age);
//		 System.out.println("Salary: " + salary);
//		 System.out.println("c:" + c);
//		 
		// Toán tử: + - * /
//		 
//		 int sum = n + n;
//		 System.out.print(sum);
//		 int x = 5;
//		 int y = 3;
//		 System.out.println(x > y);

		// switch-case
//		 int day = myObj.nextInt();
//		 switch (day) {
//		   case 1:
//		     System.out.println("Monday");
//		     break;
//		   case 2:
//		     System.out.println("Tuesday");
//		     break;
//		   case 3:
//		     System.out.println("Wednesday");
//		     break;
//		   case 4:
//		     System.out.println("Thursday");
//		     break;
//		   case 5:
//		     System.out.println("Friday");
//		     break;
//		   case 6:
//		     System.out.println("Saturday");
//		     break;
//		   case 7:
//		     System.out.println("Sunday");
//		     break;
//		 }
		// for
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				sum += i;
			}
		}
		// while
//		 int i = 10;
//		
//		 while(i >0) {
//			 sum += i;
//			 i--;
//		 }
		System.out.print(sum);

		// do-while

	}
}
