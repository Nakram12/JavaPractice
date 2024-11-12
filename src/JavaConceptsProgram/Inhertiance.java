package JavaConceptsProgram;

public class Inhertiance 
{
	String name;
	int age;

	 void eat(String name, int age)
	{
		this.name=name;
		this.age=age;
	}

	void eat()
	{
		System.out.println(name+" is eating");
	}

	void barking()
	{
		System.out.println(name+ "is sleeping");
	}

}

class Dog extends Inhertiance
{
	public Dog(String name, int age) {
		super();  // Call the parent class (Inhertiance) constructor
	}

	// Method specific to Dog class
	public void bark() {
		System.out.println(name + " is barking.");
	}

	public static void main(String[] args) 
	{	
		Dog obj=new Dog("Cat", 5);
		obj.bark();
		obj.eat();
		obj.barking();
		
	}


}


