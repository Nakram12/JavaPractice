package JavaStringPrograms;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String s="aabbaabb";
		boolean flag=false;
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			int count=0;
			
			for(int j=0; j<=s.length()-1; j++)
			{
				if(s.charAt(j)== ch)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("Fist non repeating :- "+ch);
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Not found");
		}

	}

}
