package JavaStringPrograms;

public class CovertUpperCasetoLower {

	public static void main(String[] args) {
		String s="PROGRAMMING";
		String result="";

		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);

			if(ch >= 'A' && ch <= 'Z')
			{
				ch=(char)(ch + 32);	// This logic work based on ASCII character and ch=(char) :- (char) casts the resulting integer value back to a character type.
				//ch + 32 computes the ASCII value of the corresponding lowercase character (e.g., 65 + 32 = 97 which corresponds to 'a').
				
			}
			result=result+ch;

		}
		System.out.println(result);

	}

}
