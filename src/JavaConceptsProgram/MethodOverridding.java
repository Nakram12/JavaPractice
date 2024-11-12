package JavaConceptsProgram;

/*
 * Method overriding occurs when a subclass provides a specific implementation of a method already defined in its superclass. 
 * It’s a form of runtime polymorphism, meaning the actual method called is determined at runtime based on the object type.
 */
public class MethodOverridding {

	class MethodOverridding {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends MethodOverridding {
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }
	
	public static void main(String[] args) 
	{
		MethodOverridding myAnimal = new MethodOverridding();
		MethodOverridding myDog = new Dog(); // Polymorphic behavior
	        myAnimal.sound();          // Calls Animal's sound
	        myDog.sound();  

	}

}
