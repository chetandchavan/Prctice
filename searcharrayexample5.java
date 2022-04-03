package patt;
// binary search 
public class searcharrayexample5 
{

public static void main(String a[])
 {

	    int arr[]= {10,20,30,40,50 ,60};
		int low=0;
		int end=arr.length-1;
		int mid= (low+end)/2;
		int num =25;
		
		while(low<=end)
		{
			if(arr[mid]<num)
				low= mid+1;
			
				else if(arr[mid]==num)
				{
					System.out.print("record found " +mid );
          			break;
		        }
				else 
					end= mid-1;
			
			
			mid= (low+end)/2;
		
		}
		if(low>end)
			System.out.println("record not found sorry");
			
}
}
