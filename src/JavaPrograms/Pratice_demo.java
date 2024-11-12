package JavaPrograms;

public class Pratice_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Akram ";
		String rev=" ";
		char a[]=st.toCharArray();
		int len=a.length;
		System.out.println("Length of String :- "+len);
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Revers string is :-"+rev);
		
		
		
	}

}
