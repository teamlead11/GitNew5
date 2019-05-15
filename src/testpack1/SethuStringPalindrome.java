package testpack1;


public class SethuStringPalindrome {
public static class StringPalindrome {
	public static void checkPalindrome(String s) {
		String reverse=new StringBuffer(s).reverse().toString();
		if (s.equals(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) {
		checkPalindrome("madam");
		checkPalindrome("india");
		checkPalindrome("amma");
<<<<<<< HEAD
		
=======
		checkPalindrome("set");
				
>>>>>>> 4e6d95ab6e161d28789be85c45d2ce49e5ec2030
}
}}