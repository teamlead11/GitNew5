 package testpack;

<<<<<<< HEAD
public class BaseClass {
<<<<<<< HEAD
	public void bubbleshortaparna() {
		int a[]= {4,9,5,9,1};
		int t;
		for (int i=0;i<4;i++);
		{
			
			for(int j=0;j<=4;j++) {
			
				if(a[j]>a[j+1]) {
					int i;
					t=a[i];
					a[j]=a[t];
					a[i]=t;
					
				}
			}
			
			
		}

		for(int k=0;k<4;k++) {
			System.out.println(k);
		}
			}

=======
	
=======
import java.util.Scanner;
>>>>>>> 258574c7047f555760da566821fbb6c8febf8993
>>>>>>> 4e6d95ab6e161d28789be85c45d2ce49e5ec2030





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
		System.out.println("Base class");
		System.out.println("git hub");
	}
	===

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
String title=driver.getTitle();
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);



pending tasks
twitter
irtc
insta
hdfc



//WebElement txtto=driver.findElement(By.className("ui-inputtext ui-widget"));
//txtto.sendKeys("hyderabad");
//WebElement btnfind=driver.findElement(By.xpath("//input[@value='ui-inputtext']"));
//btnfind.click();
WebElement btnContactUs=driver.findElement(By.xpath("//a[@href='contact.php']"));
btnContactUs.click();
WebElement txtname=driver.findElement(By.xpath("//input[@type='text'][1]"));
txtname.sendKeys("sona");
WebElement txtemail=driver.findElement(By.xpath("//input[@type='email']"));
txtemail.sendKeys("sonam.shaik@gmail.com");
WebElement txtphone=driver.findElement(By.xpath("//input[@name='phone']"));
txtphone.sendKeys("8899774466");
WebElement txtcourses=driver.findElement(By.xpath("//select[@name='courses']"));
txtcourses.sendKeys("selenium");
WebElement txtbranch=driver.findElement(By.xpath("//select[@name='branch']"));
txtbranch.sendKeys("omr");
WebElement txttime=driver.findElement(By.xpath("//select[@name='time']"));
txttime.sendKeys("9AM");
WebElement txtcomment=driver.findElement(By.xpath("//textarea[@name='comments']"));
txtcomment.sendKeys("Selenium  course details and fee");












WebElement txtname1=driver.findElement(By.xpath("//input[@name='lastname']")); 
txtname1.sendKeys("gudia");
WebElement txtradio=driver.findElement(By.xpath("//input[@name='id']")); 
txtradio.sendKeys("female");
WebElement txtradio1=driver.findElement(By.xpath("//input[@name='exp']")); 
txtradio1.sendKeys("3");
WebElement txtdate=driver.findElement(By.xpath("//input[@id='datepicker']")); 
txtdate.sendKeys("may3");
WebElement txtprofession=driver.findElement(By.xpath("//label[@class='checkboss']")); 
txtprofession.sendKeys("Automation tester");
WebElement txtfile=driver.findElement(By.xpath("//input[@id='photo']")); 
txtfile.sendKeys("abc");
WebElement txtcheckbox=driver.findElement(By.xpath("//input[@name='tool']")); 
txtcheckbox.sendKeys("selenium webdriver");
WebElement txtcontinents=driver.findElement(By.xpath("//select[@name='continents']")); 
txtcontinents.sendKeys("india");
//
WebElement btnId=driver.findElement(By.xpath("//button[@name='submit']")); 
btnId.sendKeys("abc");










public void BubbleSortSonam() {

        int arr[]= {2,7,9,5,2}
        for (int i = 0; i < 5; i++) 
            for (int j = 0; j <4-i; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
for (int i = 0; i <5; i++) {
	System.out.println(arr[i]);
	
}    

====================================================
package testpackage;

import java.util.Scanner;

public void class bubblesortSethu {

	public static void main(String[] args) {
		 int n, c, d, swap;
		    Scanner in = new Scanner(System.in);
		 
		    System.out.println("Input number of integers to sort");
		    n = in.nextInt();
		 
		    int array[] = new int[n];
		 
		    System.out.println("Enter " + n + " integers");
		 
		    for (c = 0; c < n; c++)
		      array[c] = in.nextInt();
		   
		    for (c = 0; c < ( n - 1 ); c++) {
		      for (d = 0; d < n - c - 1; d++) {
		        if (array[d] > array[d+1]){
		          swap       = array[d];
		          array[d]   = array[d+1];
		          array[d+1] = swap;
		        }
		      }
		    }
		 
		    System.out.println("Sorted list of your given numbers:");
		 
		    for (c = 0; c < n; c++)
		      System.out.println(array[c]);
		  
>>>>>>> 258574c7047f555760da566821fbb6c8febf8993
	}
	public void bubblesortinduja() {
		int a[]= {4,9,5,9,1};
		int t;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[i];
					a[j]=a[i];
					a[i]=t;
				}
			}
		}
		for(int k=0;k<4;k++)
		{
			System.out.println(a[k]);
		}
====
}









