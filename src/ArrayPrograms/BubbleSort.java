package ArrayPrograms;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String []args)
	{
		int a[]= {2,5,3,1,6,8,0,9};

		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

//		int a[]= {1,2,5,8,6,3,4,0,7};
//
//		for(int i=0 ; i<a.length; i++)	
//		{
//			for(int j=0; j<a.length-1; j++)
//			{
//				if(a[j]>a[j+1])
//				{
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}System.out.println(Arrays.toString(a));

	}
}
