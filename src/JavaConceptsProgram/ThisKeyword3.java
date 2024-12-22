package JavaConceptsProgram;

// this() : to invoke current class constructor 
//The this() constructor call can be used to invoke the current class constructor. 
//It is used to reuse the constructor. In other words, it is used for constructor chaining.

public class ThisKeyword3 {
	
	ThisKeyword3()
	{
		this(10);
		System.out.println("No arug construtor");
	}
	
	ThisKeyword3(int a)
	{
		// this(); // 
		System.out.println("Parametrized construtor");
	}
	
	public static void main(String[] args) {
		ThisKeyword3 th=new ThisKeyword3();

	}

}
