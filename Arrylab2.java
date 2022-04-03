package Arraylab;

import java.util.Scanner;

public class Arrylab2 {

	public static void main(String[] args) {
		Testing1 j =new Testing1 ();
	    j.input();
	 
	System.out.println("0.Exit  1.show 2.evencount 3.Reverse 4. sum 5.copyarray 6.largest value 7.search any number 8.Array sort");
		System.out.println("Enter your choice");
		Scanner h =new Scanner(System.in);
		int choice=h.nextInt();
		
	
			
		switch (choice) {
		case 1: j.show();
		break;
		case 2: j.evencount();
		break;
		case 3: j.reverse();
		break;
		case 4:  System.out.println("sum of array are "+ j.sum());
		break;
		case 5: j.copyarry();
		break;
		case 6: j.largest();
		break;
		case 7: Scanner l =new Scanner(System.in);
		System.out.println("Enter your no which you want to search in array a");
		 int x=l.nextInt();
		System.out.println(j.search(x));
		break;
		case 8:j.sort();
		break;
		default: System.out.println("Sorry, you entered wrong input");
		}
		
		
	 	
	 	
	 	
	 	}
	
	
}

	
	

	

		/*
		case '8' : 
			
			    
		
		
	
		//j.sum();

*/