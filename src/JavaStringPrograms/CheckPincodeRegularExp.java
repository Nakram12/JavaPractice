package JavaStringPrograms;

import java.util.Scanner;

public class CheckPincodeRegularExp {

	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System .in);
//		System.out.println("Enter the Valid 6-digit Pincode");
//		
//		String pincode=sc.nextLine();
		String pincode="123456";
		
		if(pincode.matches("\\d{6}"))
		{
			System.out.println("Valid Pincode");
		}else
		{
			System.out.println("invalid Pincode");
		}
		
		/*
		 * String pincode="123456";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pincode");
		
		String pincode=sc.nextLine();
		
		for(int i =0; i<pincode.length(); i++)
		{
			char ch=pincode.charAt(i);
			if(pincode.matches("\\d{6}"))
			{
				System.out.println("valid pincode");
				break;
			}else
			{
				System.out.println("Invalid Pincode");
				break;
			}
		}s
		 */

	}

}
