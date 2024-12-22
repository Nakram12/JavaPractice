package JavaConceptsProgram;

// this: to invoke current class method 

public class Thiskeyword2 {
	
	void display()
	{
		System.out.println("Hello");
	}
	
	void show()
	{
		display(); // if we dont provide this.display() even though its work
	}

	public static void main(String[] args) {
		
		Thiskeyword2 th=new Thiskeyword2();
		th.show();
	}

}
