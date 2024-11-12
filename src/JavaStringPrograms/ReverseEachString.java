package JavaStringPrograms;

public class ReverseEachString {

	public static void main(String[] args) {
		/*String str="Welcome To Java";
		String [] words=str.split(" ");
		String reversstring="";
		
		for(String w:words)
		{
			String reversword="";

			for(int i=w.length()-1; i>=0; i--)
			{
				reversword=reversword+w.charAt(i);
			}
			reversstring=reversstring+reversword+" ";
		}
		System.out.println("The Revers String is :- "+reversstring); */

		
		
		
		// Reversing the string by using the String Builder Class

		/*String str="Welcome To Java";
		String [] words=str.split(" ");
		String Reversword="";
		
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			Reversword=Reversword+sb.toString()+" ";
			//System.out.println("Inside for loop :- "+Reversword);
		}
		System.out.println("Inside for loop :- "+Reversword); */
		
		
		
		
		
	/*	// Another Way for printing reverse by using the String Builder
		String str="Welcome to Java Selenium";
		String [] w=str.split(" ");
		
		for(int i=w.length-1; i>=0; i--)
		{
			StringBuilder sb=new StringBuilder(w[i]);
			//sb.append(reverseWord.)
			System.out.print(sb.reverse().append(" "));
		} */
		
		String str="Welcome to java";
		String [] st=str.split(" ");
		String reverseString="";
		
		for(String w:st)
		{
			String reverseword="";
			for(int i=w.length()-1; i>=0; i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword+" ";
		}
		
		System.out.println("The Reversed Sentance is :- "+reverseString);
		



	}

}
