package JavaConceptsProgram;

public class Encapuslation 
{
	private int acc_num;
	private String name;
	private double amount;
	
	//setter method
	void setAccount(int accnum)
	{
		acc_num=accnum;
	}
	
	//getter method
	int getAccount()
	{
		return acc_num;
	}
	
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public static void main (String []agrs)
	{
		Encapuslation accObj=new Encapuslation();
		accObj.setAccount(1234);
		accObj.setAmount(200000);	
		System.out.println(accObj.getAmount());
		System.out.println(accObj.getAccount());
	}

}

