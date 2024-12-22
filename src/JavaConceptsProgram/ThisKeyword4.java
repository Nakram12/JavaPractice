package JavaConceptsProgram;

// this: to pass as an argument in the method
// The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.

public class ThisKeyword4 {

	void m1(ThisKeyword4 t) // Thiskeyword4 t is the paramter
	{
		System.out.println("Im in m1 method");
	}
	
	void m2()
	{
		m1(this); // this is the argument 
	}
	
	public static void main(String[] args) {
		ThisKeyword4 th=new ThisKeyword4();
		th.m2();
		
		
	
	
	
	}

}
