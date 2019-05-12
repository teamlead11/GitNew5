package testpack;

import java.util.Scanner;

public class Palindromesonam {
public static void main(String[] args) {
	String str, rev = "";
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	str = sc.nextLine();
	  int Length = str.length();
	  for (int i = Length -1; i >=0; i--) {
		  rev =rev + str.charAt(i);
		  
	}
	  if(str.contentEquals(rev)) {
		  System.out.println(str+" is a palindrome");
	  }
	  else {
		  System.out.println(str+"is not a palindrone");
	  }
}
}
