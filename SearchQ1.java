package patt;

public class SearchQ1 {

	public static void main(String[] args) {
		
		int arr []= {10,20,30,40,80};
		int low=0;
		int end=arr.length-1;
		int mid = (low +end )/2;
		int num =25;
		
		while (low <=end)
		{
			if (arr[mid]<num)
				low =mid+1;
			else if (arr[mid]==num)
				{
				System.out.println("chetan");
				break;
				}
			else 
				end=mid-1;
			mid =(low+end)/2;
		}
		if (low > end)
			System.out.println("not cheta");
				}
		
	}


