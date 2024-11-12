
package JavaPrograms;

// reversing the give string can been done by 3 different ways

public class StringRevers 
{
	public static void main(String []args)
	{
		String str="XYZABC";
		String rev="";
		
		/*//int len=str.length();
		
		for(int i=str.length()-1; i>=0; i-- )
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Revers string is :-"+rev); */
		
		// Using charter array
		// Converting String into charArray
		
		char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Revers string is :-"+rev);
		
		// using the string buffer class
		
	StringBuffer sb=new StringBuffer(str);
	System.out.println("Reverse String is :-" +sb.reverse());
			
		
	}
}
