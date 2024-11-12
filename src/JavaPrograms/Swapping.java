package JavaPrograms;

public class Swapping 
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		
		a = a + b; // Now a is 15 (5 + 10)
        b = a - b; // Now b is 5 (15 - 10)
        a = a - b;
		
		System.out.println("a:-"+a);
		System.out.println("b:-"+b); 
		
		/*System.out.println("Before Swapping A:-"+a+ " B:-"+b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Before Swapping A:-"+a+ " B:-"+b); */
	}
}
