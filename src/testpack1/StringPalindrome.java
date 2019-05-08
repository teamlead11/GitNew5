package testpack1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		Scanner scan=new Scanner(System.in);
		original=scan.nextLine();
		
		int length=original.length();
		
		for(int i= length - 1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
			if(original.equals(reverse)){
				System.out.println("Entered string is a palindrome");
			}else {
				System.out.println("Entered string is not a palindrome");
			}
			
	}

	}

}
