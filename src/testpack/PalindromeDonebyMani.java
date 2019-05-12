package testpack;

import java.util.Scanner;

public class PalindromeDonebyMani {

	public static void main(String[] args) {
		
		System.out.println("Enter the Text to chk palindrome : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String S1="";
		for (int i =s.length()-1; i >=0; i--) {
			S1=S1+s.charAt(i);
			
		} 
		if(S1.equalsIgnoreCase(s))
		{
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("not palidrome");
		}
	
	}
}
