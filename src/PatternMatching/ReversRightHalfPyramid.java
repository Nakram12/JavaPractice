 package PatternMatching;

public class ReversRightHalfPyramid {

	public static void main(String[] args) {
		for(int i=4; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}