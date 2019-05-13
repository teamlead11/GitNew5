package testpack;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	
	System.out.println("Enter the String to reverse : ");
	Scanner s = new Scanner(System.in);
	String s1 = s.nextLine();
	String s2 = "";
	for (int i =s1.length()-1; i >=0; i--) {
		s2=s2+s1.charAt(i);
		
	} 
	System.out.println(s2);
}
}
