package JavaConceptsProgram;

public class ConstruterOverloading 
{
	ConstruterOverloading(String firstname)
	{
		System.out.println("FisrtName :- "+firstname);
	}
	ConstruterOverloading(String branchname, String cityname)
	{
		System.out.println("BaranchName :- "+branchname + "CityName :- " +cityname);
	}
	
	ConstruterOverloading(int age)
	{
		System.out.println("Age :- "+age);
	}
	public static void main(String[] args) 
	{
		ConstruterOverloading obj3=new ConstruterOverloading(20);
		ConstruterOverloading obj1=new ConstruterOverloading("Lakman");
		ConstruterOverloading obj2=new ConstruterOverloading("Computer Scient "+"Banagalore");
		//ConstruterOverloading obj3=new ConstruterOverloading("20");

	}

}
