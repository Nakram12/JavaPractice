package ArrayPrograms;

public class DublicateByDiffMethod {
	
	public static boolean areArraysEqual(int[] ar1, int[] ar2)
	{
		// checking length of an Array
		if(ar1.length != ar2.length)
		{
			return false;
		}
		
		//Reading the for loop
		for(int i=0; i<=ar1.length-1; i++)
		{
			if(ar1[i] != ar2[i]);
			{
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		int ar1[]= {1,3,4,5,6};
		int ar2[]= {1,3,4,5,6};
		
		System.out.println("Are Arrays are Equal? "+areArraysEqual(ar1 , ar2));
	}

}
