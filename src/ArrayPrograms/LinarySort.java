package ArrayPrograms;

public class LinarySort {

	public static void main(String[] args) {
		int a[]= {10,20,60,50,40,70,80};
		int search_elm=40;
		boolean flag=false;
		
		for(int i=0; i<a.length-1; i++)
		{
			if(search_elm==a[i])
			{
				System.out.println("Element Found :- "+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found ");
		}
		
		

	}

}
