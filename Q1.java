//Q 1 wap to ask a number and print sum and count and average  of digits 

package Selfevaluationlab2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int a;
		Scanner j = new Scanner(System.in);
		System.out.print("Enter your number = " );
		a= j.nextInt();
		int i=0;
		int sum=0;
		int count=0;
		int avg=0;
		while (a>0) {
			sum+= a%10;
			a=a/10;
			count ++;
			
		}
		System.out.println("sum of digits = "+sum);
		System.out.println("Count of total numbers in integer = "+count);
		System.out.println("average are = "+sum/count);
		
	}

}
