package testpack;

public class BaseClass {
	public void bubbleshortaparna() {
		int a[]= {4,9,5,9,1};
		int t;
		for (int i=0;i<4;i++);
		{
			
			for(int j=0;j<4;j++) {
			
				if(a[j]>a[j+1]) {
					int i;
					t=a[i];
					a[j]=a[i];
					a[i]=t;
					
				}
			}
			
			
		}

		for(int k=0;k<4;k++) {
			System.out.println(k);
		}
			}


	public static void main(String[] args) {
		System.out.println("this is my base class");
	}

}
