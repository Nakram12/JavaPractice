package ArrayPrograms;

public class LinarySort {

	public static void main(String[] args) {
		int a[]= {10,20,60,50,40,70,80};
		int search_elm=100;
		boolean flag=false;
		
        for (int i = 0; i < a.length; i++) { // Loop through the array
            if (search_elm == a[i]) { // If the search element matches the current element
                System.out.println("Element Found at Index: " + a[i]); // Print the index
                flag = true; // Set flag to true as the element is found
                break; // Exit the loop after finding the element
            }
		}
		if(!flag)
		{
			System.out.println("Element not found ");
		}
		
		

	}

}
