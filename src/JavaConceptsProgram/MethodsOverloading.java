package JavaConceptsProgram;

/*
 * Method Overloading :- allows multiple methods to have the same name but different parameter lists within the same class. 
 * It's a form of compile-time polymorphism, where the compiler decides which method to invoke based on the method signature.
 * 
 * Method overriding occurs when a subclass provides a specific implementation of a method already defined in its superclass. 
 * It’s a form of runtime polymorphism, 
 * meaning the actual method called is determined at runtime based on the object type.
 */
public class MethodsOverloading 
{
	int add(int a, int b)
	{
		return a + b;	
	}
	
	int add(int a, int b, int c)
	{
		return a + b +c;	
	}
	

	public static void main(String[] args) 
	{
		MethodsOverloading obj=new MethodsOverloading();
		System.out.println(obj.add(2, 10));
		System.out.println(obj.add(19, 11, 10));
		
	}

}
