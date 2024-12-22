package JavaStringPrograms;

public class CountingMultipleChar {

	public static void main(String[] args) {
		String s="Welcome to java ";
		int[] charCount=new int[256];
		//int count=0;
		
		 s=s.toLowerCase();
		
		for(int i=0; i<=s.length()-1; i++)
		{
			charCount[s.charAt(i)]++;			
		}
	//	System.out.println(charCount);
		
		for(int i=0; i<=charCount.length-1; i++)
		{
			if(charCount[i] > 1)
			{
				System.out.println((char)i + " : " + charCount[i]);
			}
		
		}

	}

}
