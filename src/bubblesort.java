
public class bubblesort {
public static void main(String[] args) {
	
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
	
	
}}