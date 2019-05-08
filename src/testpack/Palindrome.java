package testpack;

public class Palindrome {
	public static void main(String[] args) {
		int a=141, temp;
		int i=0, j=0;
		temp=a;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			
		}
		System.out.println(j);
	}

}
