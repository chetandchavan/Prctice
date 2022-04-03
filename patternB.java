package patt;
/*
 *  DCBA
 *  DCB
 *  DC
 *  D
 */
public class patternB {

	public static void main(String[] args) {

char  k='D';
for(int i=1; i<=4;i++)
{
  k='D';
 for(int j=4;j>=i;j--)
{
System.out.print(k);
k--;
}
 System.out.println();
}


	}

}
