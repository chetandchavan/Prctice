//Q 4 Write a Java program to make a new string from two given string in such a way that, 
//each character of two string will come respectively.

package Stringlab24march;

public class Q4 {
	
	public String stringmixing(String str1,String str2) {
	int len1=str1.length();
	int len2=str2.length();
	int maxl=Math.max(len1, len2);
	 String  string ="";
	 for (int i=0;i<maxl;i++) {
		 if (i<=len1-1)
			  string+=str1.substring( i,i+1);
		 if (i<=len2-1)
			  string +=str2.substring(i,i+1);
	 }
	 return new String();
	 }
	

	public static void main(String[] args) {
		Q4 m=new Q4();
		String str1="welcom";
		String str2="welcome";
		System.out.println(str1 + str2);
		System.out.println(m.stringmixing (str1,str2));

	}

}
