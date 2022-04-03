package Selfevaluationlab2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		String a="";
		Scanner j = new Scanner(System.in);
		System.out.println("Enter your string");
		a=j.next();

		int i=a.length();
		while (i>0)
			
			//if  (int i=a.length();i>0;--i) 
			{
			System.out.print(a.charAt(i-1));
			i--;
		}

	}
	}

