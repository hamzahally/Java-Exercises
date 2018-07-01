import java.util.Scanner;

public class App {

	// Write a function that is passed a string, and returns true if the string is a
	// palindrome (the same forwards as backwards), else returns false. For example,
	// "ABBA" is a palindrome, but "ACDC" is not.
	
	public static boolean isPalindrome(String palindrome) {
		for(int i = 0; i < palindrome.length(); i++) {
			if(palindrome.charAt(i) !=palindrome.charAt(palindrome.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String input;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a palindrome");

		input = sc.nextLine();

		if(isPalindrome(input)) {
			System.out.println(input + " is a palindrome");
		} else {
			System.out.println(input + " is not a palindrome");
		}
		

	}
}

