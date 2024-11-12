package JavaPrograms;

import java.util.Scanner;

public class LargestNum {

	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the value 1st :-");
		int a=sc1.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the value :- 2nd");
		int b=sc2.nextInt();
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter the value 3rd:-");
		int c=sc3.nextInt();
		
		/*if(a>b && a>c) 
		{
			System.out.println(a+"  a is largest num");
			
		}else if(b>a && b>c) 
		{
			System.out.println(b+" b is largest num");
		}
		else 
		{
			System.out.println(c+" c is largest num");
		} */
		
		// Approch 2 :-Tenary operator
		
		int largest=a>b?a:b;
		int largests=c>largest?c:largest;
		System.out.println(largests+" This the largest num");
	}
}
