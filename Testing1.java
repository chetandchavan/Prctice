//Q1  wap to define one dimensional array of  integer  in class Testing1 .
//a) Create a method input that ask numbers from user and store them in array

package Arraylab;

import java.util.Scanner;

public class Testing1 {
     int a [];
     int m;
 // int size = 4;
     
     void input() {
    	 System.out.println("Enter size of array");
    	 Scanner s = new Scanner(System.in);
    	   int size = s.nextInt();
    	a= new int [size];
    	for  (int i=0;i<a.length;i++) {
    		System.out.println("enter array number");
    		a[i]=s.nextInt();
    	}
    	
     }

    
     
     void show () {
    	 for (int i=0;i<a.length;i++) {
    	 System.out.println(" " +a[i]);
    	 }
     }
     
     
     void evencount() {
    	 int b=0;
    	 for  (int i=0;i<a.length;i++)
    	 if (a[i]%2==0)
    		 
    		 System.out.println("Even number you has entered are as "+ a[i]);
    	
 
     }

     
     
     void reverse () {
    	 for  (int i=a.length-1;i>=0;i--)
    	 {
    	
    		 System.out.println("Reverse String" +a[i]);
    	 }
     }
     
    	
    		 
     
     int sum() {
    	 int sum =0;
    	 for (int i=0;i<a.length;i++)
    		 sum+=a[i];
    	 return sum;	
    	 
}
     void copyarry() {
    	// int b[];
    	 int b []= new int [a.length];
    	 for (int i=0;i<b.length;i++) {
    		b [i]= a[i];
    	 System.out.print("copyarray  " + b[i]);
    	 }
  
     }
   void largest() {
    	// int a;
    	 int max;
    	 max = a[0];
    	 for (int i=1;i<a.length;i++) {
    		 if (a[i]>max)
    	 max=a [i];
    	
    	 }
    	 System.out.println(max );
    }

     boolean search(int y) {
    	 for (int i=0;i<a.length;i++) {
    		 if (a[i]== y)  return true;
    	 }
    		 return false ;
     }



    	 
     void sort(){
    	 int temp;
    	 
		 for(int i=0; i<a.length-1;i++)
		 { 
			 for(int j=0; j<a.length-1-i;j++)
			 {
              		if(a[j]>a[j+1])
              		{
              			temp= a[j];
              			a[j]= a[j+1];
              			a[j+1]= temp;
              			
			 } 
		 
		 }show();
     }
}
}
     
     