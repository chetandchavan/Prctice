//Q 3 write a program to ask two number from user and print their sum.(using scanner class)
package Selfevaluation;

import java.util.Scanner;

public class SumQ3 {

	public static void main(String[] args) {
		
		SumQ3 m=new SumQ3();
		m.SumQ3();
		

	}
	private void SumQ3() {
		
		int a;
		int b;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		a=k.nextInt();
		b=k.nextInt();
		int c = a+b;
		System.out.println(c);
	}

}
