//Q 16 create a class bookstore having  fields like bookname,qty and price.
//define thwo methods input and display()
//call both methods in main

package Selfevaluation;

import java.util.Scanner;

public class Bookstore {
	
     String bookname;
     int qty;
     int price;
	void input () {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your details Bookname , qty , price ");
		bookname=scanner.next();
		qty=scanner.nextInt();
		price=scanner.nextInt();
		}
	void display() {
		System.out.println("Your book name are " + bookname);
		System.out.println("Your book qty are " + qty);
		System.out.println("Your book price are "+ price);
	}
	
	public static void main(String[] args) {
		Bookstore bookstore=new Bookstore();
		bookstore.input();
		bookstore.display();
	}

}
