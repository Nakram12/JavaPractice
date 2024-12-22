package JavaStringPrograms;

import java.util.Scanner;

public class CheckUserNameWithoutReg 
{
	public static void main(String []args)
	{
/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter UserNAme");

		String username=sc.nextLine();

		if(isValidUsername(username))
		{
			System.out.println("Valid userName");
		}else
		{
			System.out.println("Invalid UserName");
		}	
	}
	public static boolean isValidUsername(String username)
	{
		if(username.length()<5 || username.length()>15)
		{
			return false;
		}

		for(int i=0; i<username.length(); i++)
		{
			char ch=username.charAt(i);
			if(!(Character.isLetterOrDigit(ch) || ch == '_'))
			{
				return false;
			}
		}
		
		return true; */
		
		 String st="Akram_123";
		
		for(int i=0; i<st.length(); i++)
		{
			char ch=st.charAt(i);
			if(ch <'0' || ch > '9' || ch < 'a' || ch > 'z'|| ch < 'A' || ch > 'Z' || ch == '_')
			{
				System.out.println("Invalid User");
				break;
			}else
			{
				System.out.println("Valid user");
				break;
			}
		}
		 
	}
}
