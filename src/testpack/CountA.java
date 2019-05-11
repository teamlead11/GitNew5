package testpack;

import java.util.Scanner;

public class CountA {

	public static void main(String[] args) {
		
		System.out.println("Enter the String :");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		char s2;
		int count = 0;
		for (int i = 0;i<= s1.length()-1; i++) {
			
			s2=s1.charAt(i);
			
			if (s2=='n') {
				count = count+1;
			}	
		}
		System.out.println(count);
		
	}
}
