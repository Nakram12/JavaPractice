package ArrayPrograms;

public class MissingNum 
{
	public static void main(String []args)
	{
		int a[]= {1,2,3,5,6};
		//int len=a.length;
		//System.out.println(len);
		
		int sum1=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in Array :- "+sum1);
		
		int sum2=0;
		for(int i=1; i<=6; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of elements in Array :-" +sum2);
		System.out.println("Missing number :- "+(sum1-sum2));
	}
}
