package JavaStringPrograms;

import java.util.Scanner;

public class CheckUsernameReg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter UserNAme");

		String username=sc.nextLine();

		if(isValidUserName(username))
		{
			System.out.println("Valid UserName");
		}else
		{
			System.out.println("Invalid UserName");
		}

	}

	public static boolean isValidUserName(String username) 
	{
		if(username.length()<5 || username.length()>15)
		{
			return false;
		}
		
		return username.matches("[A-Za-z0-9_]+");
	}

}
