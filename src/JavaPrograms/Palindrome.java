package JavaPrograms;

import java.util.Scanner;

// A number is the palindrome which revers also give the same value
public class Palindrome {
	public static void main(String args[])
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter the Number :-");
		
		int num=sa.nextInt();
		
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num /10;
		}
		if(org_num==rev)
		{
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Its not  Palindrome");
		}
	}

}
