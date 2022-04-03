//Q 4 In the above question check if sum of two numers is greater then 100 then print "welcome" else print "sorry"

package Selfevaluation;

import java.util.Scanner;

public class Sumgreaterthan100 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner k=new Scanner(System.in);
		System.out.println("Please Enter two numbers");
		a=k.nextInt();
		b=k.nextInt();
		 int c= a+b;
		 if (c>100) {
			 System.out.println("Welcome");
		 }
		 else {
			 System.out.println("Sorry");
		 }
	
		System.out.println(c);
		
	}

}
