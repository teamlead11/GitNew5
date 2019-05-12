package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		
		
	}
public void BubblesortPalanivelrajn()
{
	int n, c, d, temp;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter the Integers no:");
    n = in.nextInt();
 
    int a[] = new int[n];
 
    System.out.println("Enter " + n + " Int No:");
 
    for (c = 0; c < n; c++)
      a[c] = in.nextInt();
   
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (a[d] > a[d+1]) 
        {
        	temp       = a[d];
          a[d]   = a[d+1];
          a[d+1] = temp;
        }
      }
    }
 
    System.out.println("Result:");
 
    for (c = 0; c < n; c++)
    {
      System.out.println(a[c]);
    }
}
}
