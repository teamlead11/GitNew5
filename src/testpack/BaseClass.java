package testpack;

public class BaseClass {

	 static void bubbleSortbyManivannan(int[] arr) {
	      int n = arr.length;
	      int temp = 0;


	      for(int i = 0; i < n; i++) {
	         for(int j=1; j < (n-i); j++) {
	            if(arr[j-1] > arr[j]) {
	               temp = arr[j-1];
	               arr[j-1] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
	



	
	int a[]= {10,2,6,29};
	
	int temp=0;
	 
    int len=a.length;
    
	
	for (int i=0;i<len;i++)
		{
		for (int j=1;j<(len-i);j++)
		{
			if (a[j-1]>a[j])
			{
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
	
			}
		}
		}
	

		for (int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("this is Kalaiselvan base class");
			
	
}



private void method() {
	// TODO Auto-generated method stub
System.out.println("Resoving Confict by Manivannan");
}
}





