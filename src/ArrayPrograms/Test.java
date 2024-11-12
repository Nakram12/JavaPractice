package ArrayPrograms;

public class Test {

	public static void main(String[] args) {
		int a[]= {10,20,34,67,89};
		int search_ele=10;
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("Element found at :-"+i);
				flag=true;
				break;
				
			}
		}

	}

}
