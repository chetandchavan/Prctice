//Q 2 wap to check whether a single digit number is automorphic number or not 

package Selfevaluationlab2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		int a;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter single digit number");
		//int i=a.length();
		a=k.nextInt();
		int b = a*a;
		int c= b%10;
		if (c==a){
			System.out.println("Number is automorphic number");
		}
		else 
			System.out.println("Number is not automorphic number");
		
	}

}
