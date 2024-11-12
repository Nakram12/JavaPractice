package ArrayPrograms;

import java.util.HashSet;

public class DublicateElementsHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> obj = new HashSet<>();

		String a[] = {"Java", "Python", "C++", "C#", "Rubey","C++", "Java"};
		// Adding elements to the HashSet
		/*System.out.println(obj.add("Java"));   // Prints: true (since "Java" is added for the first time)
		System.out.println(obj.add("C++"));    // Prints: true (since "C++" is added for the first time)
		System.out.println(obj.add("Python")); // Prints: true (since "Python" is added for the first time)
		System.out.println(obj.add("Java"));   // Prints: false (since "Java" is a duplicate and cannot be added again) */
		
	/*	// reading th HashMap Using Henanc Loop
		for(String l:a) 
		{
			System.out.println(obj.add(l));
		} */
		
		boolean flag=false;
		for(String l:a)
		{
			if(obj.add(l)==false)
			{
				System.out.println("Found Dublicate "+l);
				flag=true;
			}
		}
		if(!flag)
		{
			System.out.println("Dublicate does not found");
		}

	}

}
