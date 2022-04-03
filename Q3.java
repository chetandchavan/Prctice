//Q 3 wap to check any number is spy number or not

package Selfevaluationlab2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		int a;
		Scanner k=new Scanner(System.in);
		System.out.println("enter your number");
		a=k.nextInt();
		int ld;
		int product=1;
		int sum =0;   // 1+1+2+4  =8 
		 while (a > 0) {
	            ld = a % 10;
	            sum = sum + ld;
	            product = product * ld;
	            a = a / 10;
        }
	
         if (sum==product) {
        	 System.out.println("Your number are spy number");
         }
         else {
        	 System.out.println("Your number are not spy number");
         }
	}
}
