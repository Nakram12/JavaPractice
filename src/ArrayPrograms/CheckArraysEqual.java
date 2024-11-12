package ArrayPrograms;

import java.util.Arrays;

public class CheckArraysEqual 
{
	public static void main (String []args)
    {   
        int a[] = {1, 2, 3, 4, 5, 7, 8, 9};
        int b[] = {1, 2, 3, 4, 5, 7, 8, 9};
        
        // Checking if the arrays are equal
        boolean status = Arrays.equals(a, b);
        
        if (status) 
        {
            System.out.println("Array is Equal");
        } 
        else 
        {
            System.out.println("Array is Not Equal");
        }
    }
}
