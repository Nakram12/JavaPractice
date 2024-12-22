package JavaStringPrograms;

import java.util.Scanner;

public class CheckPinCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 6-digit pincode: ");
        String pincode = sc.nextLine();

        // Validate pincode using conditions
        if (isValidPincode(pincode)) {
            System.out.println("Valid pincode.");
        } else {
            System.out.println("Invalid pincode. It must be exactly 6 digits, contain no spaces, and no alphabets.");
        }

        sc.close();
    }

    // Method to validate pincode
    static boolean isValidPincode(String pincode) 
    {
        if (pincode.length() != 6) {
            return false;
        }

        // Check if the pincode contains only digits
        for (int i = 0; i < pincode.length(); i++) {
            char ch = pincode.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;

	}

}
