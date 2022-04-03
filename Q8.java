//Q8 wap to  check a given string contains 2 to 4 number of a specified chatrcter

package Selfevaluationlab2;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		String a;
		Scanner g = new Scanner(System.in);
		System.out.println("Enter your string");
		a=g.next();
		int i=a.length();
		int count =0;
		char search= 'a';
		for (i=0;i<a.length();i++) {
			if (a.charAt(i)==search) {
			count++;
			}
		}
	//	System.out.println(count);
		if (2<=count &&count<=4) {
			
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
