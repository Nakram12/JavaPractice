package JavaStringPrograms;

public class StringDistinct {

	public static void main(String[] args) {
		 String input = "programming";  // Example input
	        String result = "";            // To store distinct characters
	        
	        // Iterate through each character
	        for (int i = 0; i <= input.length()-1; i++) {
	            char currentChar = input.charAt(i);
	            // Check if the character is unique (appears only once in the string)
	            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
	                result=result+currentChar;
	                // result += currentChar
	            }
	        }
	        
	        System.out.println("String with distinct characters: " + result);	
	        }

}
