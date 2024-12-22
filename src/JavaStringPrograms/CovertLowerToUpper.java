package JavaStringPrograms;

public class CovertLowerToUpper {

	public static void main(String[] args) {
		String s="welcome to java";
		String result="";
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				ch =(char)(ch - 32); 
			}
			result=result+ch;
		}
		System.out.println(result);

	}

}
