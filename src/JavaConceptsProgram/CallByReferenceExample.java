package JavaConceptsProgram;

class Person
{
	String name;

	Person(String name)
	{
		this.name = name;
	}
	
	public static void changeName(Person d)
	{
		d.name="abc";
		System.out.println("Inside Method : "+d.name);
	}
}

public class CallByReferenceExample {
	public static void main (String args[]){

		Person p=new Person("Alice");
		System.out.println("Before Method Call : "+p.name);

		
	//	changeName(p);
		p.changeName(p);
		System.out.println("After Method Call : "+p.name);
		


	}

	/*public static void changeName(Person c)
	{
		c.name="abc";
		System.out.println("Inside Method : "+c.name);
	} */
}
