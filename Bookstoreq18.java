//Q 16 create a class bookstore having  fields like bookname,qty and price.
//define thwo methods input and display()
//call both methods in main
//Q 17 in same above question define another method chekprice that return integer value
//i.e dicounted amount if price>5000 dicount is 200 rs else 100 rs.
		
package Selfevaluation;

import java.util.Scanner;

public class Bookstoreq18 {
	
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
	void checkprice1 () {
		int discount ;
		if (price >5000) {
			System.out.println("your discount are 200rs");
		}
		else 
			System.out.println("Your discount are 100rs");
			
	}
	public static void main(String[] args) {
		String collegename;
		
		Bookstoreq18 bookstore=new Bookstoreq18();
		bookstore.input();
		bookstore.display();
		bookstore.checkprice1();
	}

}
