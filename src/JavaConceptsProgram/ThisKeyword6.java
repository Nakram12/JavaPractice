package JavaConceptsProgram;

// this keyword can be used to return current class instance 
// We can return this keyword as an statement from the method. 
//In such case, return type of the method must be the class type (non-primitive).

public class ThisKeyword6 {
	
	ThisKeyword6 m1()
	{
		return this;
	}
	
	void msg()
	{
		System.out.println("hello java");
	}

	public static void main(String[] args) {
		//ThisKeyword6 t=new ThisKeyword6();
	//	t.m1().msg();	
		new ThisKeyword6().m1().msg();
	}

}
