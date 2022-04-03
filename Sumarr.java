package Arrylec28march;

import java.util.Scanner;

public class Sumarr {

	public static void main(String[] args) {
		int a[]=new int [5];
		int i=0;
		int sum=0;
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter number");
		for (a[i]=0;a[i]<=4;a[i]++) {
		a[i]=scanner.nextInt();
		}
		for (i=0;i<5;i++) {
			sum = a[i]+sum;
		}
		System.out.println(sum);
	}

}
