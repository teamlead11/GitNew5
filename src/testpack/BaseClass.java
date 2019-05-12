package testpack;

public class BaseClass {
	private void reveseString() {
	String s="induja";
	String r ="";
	for(int i=s.length()-1;i>=0;i++) {
		char charAt = s.charAt(i);
		r=r+charAt;
	}
System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		System.out.println("Base class");
		System.out.println("git hub");
	}

}
