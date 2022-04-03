package Selfevaluation;

import java.util.Scanner;

//Q 6  write a program  to ask name and code (String) of security staff .
//if code =="COOLCOOL" then print "welcome user" else Ask him to reenter code .and 
//maximum chance to enter code is 3.After third attempt print 

public class SecurityGobackQ6 {

	
		
	//	String keyword ; //="COOLCCOL";
	
		  void checkkeyword()
		  {  
			  String keyword;
			  int i;
			  Scanner s= new Scanner(System.in);
			//  System.out.println("Enter your keyword");
			  for(i=1;i<=3;i++)  
			  {
			  System.out.println("enter keyword");
			  keyword= s.next();  
			  if(keyword =="COOLCOOL")
			     {
				  System.out.println("WELCOME USER");
			      
			     }
			  else  {
				  System.out.println("Enter keyword again");
			  }
			//  if( i!=4) {
				//  System.out.println("card blocked");
			  }
			  }
			  
	//}
		  public static void main(String[] args) {
			  SecurityGobackQ6 j =new SecurityGobackQ6();
			  j.checkkeyword();
		  }
}
