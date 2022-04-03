package patt;

public class passingarraytomethod {
    // y and g both point to same array address
	
	static void show(int g[])
	{  System.out.println("inside show method");
		    for(int i=0;i<g.length;i++)
			System.out.print(" "+g[i]);
	}
	
	static void display(String e[],int p[])
	{
		for(String s:e)System.out.println(s);
		for(int x:p)System.out.println(x);
	}
	public static void main(String[] args) {
		
		int y[]= {11,2,3,4,65,6};//local array to main 
		show(y);//passing array to function 
		
		String name[]= {"neha","gagan","ashu"};
		display(name,y);

	}

}
