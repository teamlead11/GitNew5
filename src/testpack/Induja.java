package testpack;

import java.util.Scanner;

public class Induja {
public static void main(String[] args) {	
		Scanner s1=new Scanner(System.in);
		String s=s1.next();
				String r="";
		for (int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			r=r+ch;
			
		}
		System.out.println(r);
		if(r.equals(s)) {
			System.out.println("palinrome String"); 
		}
		else {
			System.out.println("not a polindrome String");
		}
	}















}
