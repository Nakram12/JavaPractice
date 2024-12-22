package JavaConceptsProgram;

//this: to pass as argument in the constructor call
//We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes.

class Test
{
	Test(Thiskeyword5 td)
	{
		System.out.println("test class");
	}
}

public class Thiskeyword5 {
	
	void m1()
	{
		Test test=new Test(this);
	} 
	
	
	
	public static void main(String[] args) {
		Thiskeyword5 t=new Thiskeyword5();
		t.m1();   
		
	}

	
	
		
	
	
		

	}


