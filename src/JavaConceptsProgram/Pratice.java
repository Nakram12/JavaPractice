package JavaConceptsProgram;

public class Pratice {
	{
		int i=10;

	}
	class B extends Pratice
	{
		int i=20;
		void show(int i)
		{
			System.out.println(this.i);
		}
	}

	public static void main(String[] args) 
	{
		B obj=new B();
		obj.show();
		
	}

}
