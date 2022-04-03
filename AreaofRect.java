//Q 13  Write a Java program to print the area and perimeter of a rectangle.
 //     Input  Width = 5.5 Height = 8.5
package Selfevaluation;

public class AreaofRect {
	
	void area() {
		float width=5.5f;
		float height =8.5f;
		float area;
		area = width*height;
		System.out.println("area of rectangal=="+ area);
	}
	void perimeter() {
		float width=5.5f;
		float height =8.5f;
		float perimeter;
		perimeter= (2 *width) + (2 *height);
		System.out.println("Perimeter of rectangal ==" + perimeter);
	}

	public static void main(String[] args) {
		AreaofRect jAreaofRect=new AreaofRect();
		jAreaofRect.area();
		jAreaofRect.perimeter();
		
		
	}

}
