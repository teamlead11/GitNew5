package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
	}
	public void bubblesortKeerthana() {
		int a[]= {7,6,4,9,1};
		int t;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j+1];
					a[j+1]=a[j];
					a[j]=t;
				}
			
			}
		}
		for(int k=0;k<=4;k++)
		{
			System.out.println(a[k]);
		}

	}
}
