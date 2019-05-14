package testpack;
import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		List <Integer>li=new ArrayList <>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(10);
		
   	    int i=li.get(3);
		System.out.println(i);
		int j=li.get(5);
		System.out.println(j);
		li.add(3, 150);
		System.out.println(li);
		li.remove(2);
	    System.out.println(li);
     	li.set(2,86665);
		System.out.println(li);
		int k=li.indexOf(30);
		System.out.println(k);
		int a=li.lastIndexOf(10);
		System.out.println(a);
		boolean b=li.contains(50);
		System.out.println(b);
	}	
	}