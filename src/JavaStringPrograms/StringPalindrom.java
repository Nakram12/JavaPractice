package JavaStringPrograms;

public class StringPalindrom {

	public static void main(String[] args) {
		String org_word="madam";
		String rev="";
			//String revword="";
			for(int i=org_word.length()-1; i>=0; i--)
			{
				rev=rev+org_word.charAt(i);
			}
			System.out.println(rev);
			
			if(rev.equals(org_word))
			{
				System.out.println("This is a palindrom");
			}else
			{
				System.out.println("This not a palindrom");
			}
	}

}
