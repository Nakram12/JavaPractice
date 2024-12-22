package JavaPrograms;

public class Fibonasci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 13 21 34
		
		int N1=0;
		int N2=1;
		int sum=0;
		
		System.out.println(N1 +" "+N2);
		
		for(int i=2; i<10; i++)
		{
			sum=N1+N2;
			//System.out.println(N1+" "+N2); 
			System.out.print(" "+sum+" ");
			N1=N2;
			N2=sum;
			
		}
	}

}
