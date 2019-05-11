package testpack;

public class BaseClass {

			
		public static void main(String[] args) {
			
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

		

}
