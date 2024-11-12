package ArrayPrograms;

// finding Even and odd using Array
public class EvenAndOddUsingArray 
{
	public static void main(String []args)
	{
		int array[]= {12,3,2,4,5,6,7,8,9};

		int even_num;
		int odd_num;

		/*for(int i=0; i<=array.length-1; i++)
		{
			if(array[i]%2==0)
			{
				System.out.println("This is an Even Number "+array[i]);
			}
			else
			{
				System.out.println("This is an odd Number "+array[i]);

			} 
		}*/
		
		for(int i=0; i<array.length-1; i++)
		{
			if(array[i]%2==0)
			{
				System.out.println("This is even Number :- "+array[i]);
			}
		}
		for(int i=0; i<array.length-1; i++)
		{
			if(array[i]%2!=0)
			{
				System.out.println("This is odd Number :- "+array[i]);
			}
		}
	}	
}
