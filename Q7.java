//Q7 wap to check if given string starts with "java"  return true otherwise return false.

package Selfevaluationlab2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		String a= "";
		Scanner j=new Scanner(System.in);
		System.out.println("Enter your string");
		a=j.next();
		String b;
		String c="java";
		int i=a.length();
		b=a.substring(0, 4);
			//System.out.println(b);
		    if (b.equals(c)){
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
				
				
			}
			
			
		}
			
				
		

	

