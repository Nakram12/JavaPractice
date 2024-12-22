package JavaConceptsProgram;

/*
 * CallByValue :- when you pass a primitive type (e.g., int, double, char) to a method, Java passes a copy of the value. 
 * Any changes made to the parameter inside the method do not affect the original variable.
 * 
 */

public class CallByValue {
	static int num=20;
	
	void modifyValue(int num) {
		
		 num = num + 10;  // Modify the local copy of num
		System.out.println("Inside modifyValue: " + num);
	}


 
	public static void main(String[] args) {
//		int num = 20; // local variable
		CallByValue test = new CallByValue();

		System.out.println("Before modifyValue: " + num);
		test.modifyValue(num);  // Passing the primitive value
		System.out.println("After modifyValue: " + num);
	}
}




