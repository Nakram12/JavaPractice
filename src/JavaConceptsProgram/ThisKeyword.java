package JavaConceptsProgram;

public class ThisKeyword {

	int a;
	
	void display(int a)
	{
		this.a=a;
	}
	
	void show()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword st=new ThisKeyword();
		st.display(20);
		st.show();
		//System.out.println(st.display());

	}

}
