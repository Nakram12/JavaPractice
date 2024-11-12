package JavaPrograms;

import java.util.Scanner;

public class CountingNumber 
{
	public static void main(String []args)
	{
		/*int num=8988940;
		
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("The total Number of digits are :-"+count);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :- ");
		
		int num=sc.nextInt();
		
		
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("The toatl Number of digts are :- "+count);
	}
}
