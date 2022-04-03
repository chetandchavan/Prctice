//Q 5   write a program that ask 5 subject marks of a student .Find average marks by dividing total by 5 . Check if marks less then 40 print fail .
//if marks between 40 to 60 print c grade
//if marks between 60 to 80 print B grade
//else A grade
package Selfevaluation;

import java.util.Scanner;

public class Studentsgradesystem {

	public static void main(String[] args) {
		int sub1;int sub2;int sub3;int sub4;int sub5;
		Scanner scanner=new  Scanner(System.in);
		sub1=scanner.nextInt();
		sub2=scanner.nextInt();
		sub3=scanner.nextInt();
		sub4=scanner.nextInt();
		sub5=scanner.nextInt();
		int avgmarks= (sub1+sub2+sub3+sub4+sub5)/5;
		if (avgmarks<40){
			System.out.println("You are Fail");
		}
		else if (avgmarks<60) {
			System.out.println("Your grade are c");
		}
		else if(avgmarks<80) {
			System.out.println("your grade are D");
		}else 
			System.out.println("your grade are A");
	}

}
