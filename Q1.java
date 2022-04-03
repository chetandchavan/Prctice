//Q1 Write a Java program to get the character at the given index within the String
package Stringlab24march;

import java.util.Scanner;

public class Q1 {

	void indexatplace() {
		String a;
		Scanner aScanner=new Scanner(System.in);
		System.out.println("Enter your string");
		a=aScanner.next();
		
		int lenght=a.length();
		int i;
		for (i=0;i<a.length();i++) {
			System.out.println(i+ " " +a.charAt(i));
		}
	}
	public static void main(String[] args) {
	Q1 kQ1=new Q1();
	kQ1.indexatplace();

	}

}
