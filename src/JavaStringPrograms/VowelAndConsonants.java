package JavaStringPrograms;

public class VowelAndConsonants {

	public static void main(String[] args) {
		String s="Welcome";
		int vowel=0;
		int consonants=0;
		
		s=s.toLowerCase();
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			if(ch >= 'a' && ch <='z')
			{
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
				{
					vowel++;
				}else
				{
					consonants++;
				}
			}
		}
		System.out.println("No of Vowel :- "+vowel);
		System.out.println("No of consonants :- "+consonants);

	}

}
