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


		public  void () {
			for (int i = 0; i < a.length-1; i++) 
			{
				for(int j=i+1; i<a.length; i++)
				{
					if(a[i]< a[j])
					{
						int temp = a[i];
						a[i] = a[j];
						a[j] = a[i];
						a[i] = temp;

					}
				}

			}





		}

	}
}
