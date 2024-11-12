package ArrayPrograms;

// For binary search , we first need to short the array first
public class BinarySearchAlgo {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int key=110;
		boolean flag=false;
		int l=0;
		int h=a.length-1;

		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==key)
			{
				System.out.println("Element found at ");
				flag=true;
				break;
			}
			if(a[m]<key)
			{
				l=m+1;
				//System.out.println("Element found 2");

			}
			if(a[m]>key)
			{
				h=m-1;
				//System.out.println("Element found 3");

			}
		}
		if(flag=false)
		{
			System.out.println("Element not found");
		}

	}

}
