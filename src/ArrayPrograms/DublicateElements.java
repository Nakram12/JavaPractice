package ArrayPrograms;

import java.util.HashSet;

public class DublicateElements 
{
	public static void main(String[] args) 
	{
		/* String a[] = {"Java", "Python", "C++", "C#", "Rubey","C++", "Java"};

        boolean flag = false;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {  // Correct increment of j
                if (a[i].equals(a[j])) {  // Use .equals() for string comparison
                    System.out.println("Found duplicate element: " + a[i]);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Duplicate element is not found.");
         } */

		// Approach 2 :- HashSet

		//  String a[]= {"Java", "Python", "C++", "C#", "Rubey","C++", "Java"};

		HashSet<String> obj = new HashSet<>();

		// Adding elements to the HashSet
		System.out.println(obj.add("Java"));   // Prints: true (since "Java" is added for the first time)
		System.out.println(obj.add("C++"));    // Prints: true (since "C++" is added for the first time)
		System.out.println(obj.add("Python")); // Prints: true (since "Python" is added for the first time)
		System.out.println(obj.add("Java"));   // Prints: false (since "Java" is a duplicate and cannot be added again)        

	}

}
