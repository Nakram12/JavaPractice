package JavaConceptsProgram;

public class MainMethodOverloadding1 {

//	public static void main(integer args) {
		public static void main(Integer[] args)   
		{   
		System.out.println("Overloaded main() method invoked that parses an integer argument");   
		} 
		
		public static void main(char[] args) 
		{
			System.out.println("Overloadding the main method invoked that parses an char argumemnt");
		}
		
		public static void main(String[] args) 
		{
			System.out.println("Orginal main() method invoked");
			char a[]= {'a','b'};
			int b[]= {1,2,3};
			//MainMethodOverloadding1.main(a[]);
			MainMethodOverloadding1.main(a);
			new MainMethodOverloadding1().main({1});
		}
	}

