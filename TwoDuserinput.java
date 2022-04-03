package patt;

import java.util.Scanner;

//wap to design 2d matrix and ask size of matrix from user
public class TwoDuserinput {

	public static void main(String[] args) {

		int a[][];
		Scanner s= new Scanner(System.in);
        System.out.println("enter row and column size");
		int row= s.nextInt();
		int column= s.nextInt();
		
		a= new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("enter array elements");
				a[i][j]= s.nextInt();
				
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(" "+a[i][j]);
					}
			System.out.println();
		}
	}
    

	}


