package JavaPrograms;

import java.util.Arrays;

//Write a Java program to sort an array of integers in ascending order

public class ArrayPrograms 

{
	public static void main(String  args[])
	{
		int a[]= {12,23,45,67,788,80,90,00};


		// Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		// with you using any inbuilt methods

		for (int i = 0; i < a.length-1; i++) 
		{
			for(int j=0; i<a.length-1-i; i++)
			{
				if(a[j]> a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//a[i] = temp;
				}
			}
		}System.out.println(Arrays.toString(a));
		
	}
}
