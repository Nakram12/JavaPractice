package JavaPrograms;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :-");
		
		int num=sc.nextInt();
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rev=num%10;
			if(rev%2==0)
			{
				even_count++;
				
			}
			else
			{
				odd_count++;
			
			}
			num=num/10;
		}
		System.out.println("Number of even:-"+even_count);
		System.out.println("Number of odd:-"+odd_count);
	}

}