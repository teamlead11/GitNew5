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
<<<<<<< HEAD
	
	String n="NIRESH";
	int length= n.length();
	System.out.println(length);

	int size=n.indexOf(n);
	System.out.println(n);
=======

		BaseClass ob=new BaseClass();
		ob.bubbleSort_Ramesh();
		
	}
	
	
	
	
	
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

	
>>>>>>> 6ac26f68f7fccd0d70cc5e258ff50fd9b6dab755

	
}
<<<<<<< HEAD
	public static void bubbleSortNiresh()  {
		String n="NIRESH";
		int length=n.length();
		System.out.println(length);
		
	}
}
=======




>>>>>>> 6ac26f68f7fccd0d70cc5e258ff50fd9b6dab755
