package ArrayPrograms;

public class MaxAndMin 
{
	public static void main(String []args)
	{
		int a[]= {12,3,4,5,23,5,20};
		int max =a[0];
		int secound_max= a[0];
		//int third_max=a[0];
		
		for (int i=0; i<a.length; i++)
		{
			
			if(a[i]>a[0])
			{
			
				max=a[i];
				secound_max=max;
			//	max=third_max;
			}else if (a[i] > secound_max && a[i] < max)			
			{
				secound_max=a[i];
			}
		}
		System.out.println("Max Element in array is :- "+secound_max);  
		
		//Getting max value
		/*for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}System.out.println("Max value is :- "+max);  */
		
		//Secound Max
		/*for(int i=0; i<a.length; i++)
		{
			if(a[i]>a[0])
			{
				max=a[i];
				a[i]=secound_max;
				
			}else if(a[i]>secound_max && a[i]<max)
			{
				secound_max=a[i];
			}
			
		}System.out.println("Secound max :-"+secound_max ); */
		
		/*int a[]= {23, 4, 3, 5, 6, 1, 7};
		int min=a[0];
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]<min);
			{
				min=a[i];
			}
		}
		System.out.println(min); */ 
		
		//Third Max
		/*int a[]= {12,3,59,5,23,50,55,20,53,};   
		int max =a[0];
		int second_max=a[0];
		int third_max=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}else if(a[i]<=max && a[i]>second_max)
			{
				second_max=a[i];
			}else if(a[i]<=max && a[i]<=second_max && a[i]>third_max)
			{
				third_max=a[i];
			}
         
		}
		System.out.println(max);
		System.out.println(second_max);
		System.out.println(third_max);  */
		
		
	}
}
