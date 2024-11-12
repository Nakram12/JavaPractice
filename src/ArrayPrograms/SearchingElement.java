package ArrayPrograms;

public class SearchingElement {

	public static void main(String[] args) {
		int a[]= {10,20,34,04,67,89};
		int search_ele=67;
		
		for(int i=0; i<a.length; i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("Element found at :-"+i);
				break;
			}
		}
		
	}

}
