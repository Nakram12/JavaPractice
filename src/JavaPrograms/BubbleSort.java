package JavaPrograms;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[]= {10,40,2,40,78,90,99,12};
		int temp;
		int flag;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length-1-i; j++)
			{
				if(a[i] > a[j+1])
				{
					temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}if(flag==0)
			{
				break;
			}
			
		}
		
	}

}
