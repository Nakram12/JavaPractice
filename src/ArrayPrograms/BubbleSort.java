package ArrayPrograms;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String []args)
	{
		int a[]= {12,2,3,5,4,7,9,10,8};
		System.out.println("Array before shorting :- "+Arrays.toString(a));
		
		int n=a.length;
		System.out.println();
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if(a[j]>a[j+i])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}System.out.println("After shorting :- "+Arrays.toString(a));
	}
}
