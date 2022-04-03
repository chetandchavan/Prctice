//Q 14  wap  to print numbers between 1 to 100 which are divisible by 3, 5 and by both. 
//Go to the editor
//Sample Output:

package Selfevaluation;

public class Dividedby3and5Q14 {
	void Dividedby3() {
	int a;
	for (a=0;a<100;a++) {
		if (a%3==0) {
			
		System.out.println(a);
	}
		}
	}
	void dividedby5() {
		int a=0;
		for (a=0;a<100;a++) {
			if(a%5==0)
				System.out.println(a);
		}
	}
	void bothby35() {
		int a=0;
		for (a=0;a<100;a++) {
			if (a%3==0&&a%5==0)
				System.out.println(a);
		}
	}
	
	
	
	public static void main(String[] args) {
		Dividedby3and5Q14 mDividedby3and5q14=new Dividedby3and5Q14();
		mDividedby3and5q14.Dividedby3();
		mDividedby3and5q14.dividedby5();
		mDividedby3and5q14.bothby35();
	}

}
