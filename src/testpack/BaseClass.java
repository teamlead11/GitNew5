 package testpack;

import java.util.Scanner;





public class BaseClass 
    {
	
	public void bubbleSortIbraheem()
	{
		
		String s= "Shahid";
		int length= s.length();
		
		System.out.println(length);
		

		}
	public static void main(String[] args) 
	{
	
		System.out.println("this is my base class");

		BaseClass ob=new BaseClass();
		ob.bubbleSort_Ramesh();
		
	}


	
	String n="NIRESH";
	int length= n.length();
	System.out.println(length);

	int size=n.indexOf(n);
	System.out.println(n);

		
	
	public void bubbleSort_Ramesh()
	{
		
       Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the array length");
		
		int len=sc.nextInt();
		
		int a[]=new int[len];
		
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
					
	
		System.out.println("ascending order");		
		 for(int i=0;i<len;i++)
		 {
			 System.out.println(a[i]);
		 }
		

	}

	
	public static void bubbleSortNiresh()  {
		String n="NIRESH";
		int length=n.length();
		System.out.println(length);
		
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
