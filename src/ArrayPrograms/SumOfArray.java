package ArrayPrograms;

// Sum of an array

public class SumOfArray {

	public static void main(String[] args) 
	{
		//int ar[]= {12,32,4,0,56,44,4,33,2,2};
		  int ar[]= {1,2,3,5,6};
		int sum=0;
		for(int i=0; i<=ar.length-1; i++)
		{
			sum=sum+ar[i];

		}
		System.out.println("Sum of Array is :-"+sum);
	}

}
