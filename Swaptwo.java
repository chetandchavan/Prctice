package Selfevaluation;

import java.util.Scanner;

public class Swaptwo {

	void swap() {
		int a;
		int b;
		int temp=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two integer numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("Numbers before swapping a== " +a+ "  b==     "+ b );
		temp=a;
	    a=b;
		b=temp;
		System.out.println("Numbers after swapping a== "+a+ "   b==    "+b );
		
		
	}
 
	public static void main(String[] args) {
		Swaptwo jSwaptwo=new Swaptwo();
		jSwaptwo.swap();
	}

}
