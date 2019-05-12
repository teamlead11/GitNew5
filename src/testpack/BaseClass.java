package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		
		
	}
public void bubbleSortIbraheem() {
	
	String s= "Shahid";
	int length= s.length();
	
	System.out.println(length);
	

	}
public static void main1(String[] args) {
	

int array[]= {6,5,8,4};
System.out.println("before sorting");
for (int i : array) {
	System.out.println(i);
}
bubblesort(array);
}
public static void bubblesort(int[] array) {
int temp=0;
for(int i=0;i<array.length;i++) {
	for(int j=1;j<(array.length);j++) {
		if(array[j-1]>array[j])
		{
		temp=array[j-1];
		array[j-1]=array[j];
		array[j]=temp;
	}
}
}for (int i : array) {
System.out.println(i);
}

}
	

	
}




