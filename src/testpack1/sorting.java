package testpack1;

public class sorting {
	int a[]= {4,9,5,9,1};
	int t;
	for (int i=0; i<4; i++ );
	{
		
		for(int j=0;j<4-i; j++) {
		
			if(a[j]>a[j+1]) {
				t=a[i];
				a[j]=a[i];
				a[i]=t;
				
			}
		}
		
		
	}
	for(int k=0;k<4;k++) {
		System.out.println(a[k]);
		}

	}


}
