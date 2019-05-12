package testpack;

public class BaseClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		System.out.println("Base class");
		System.out.println("git hub");
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
	}
}
