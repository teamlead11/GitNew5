package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		   int arr[]={10,9,8,7};
		   int b[]=bubbleSortSridhar(arr);
		   for(int i=0;i<b.length;i++){
			   System.out.println(b[i]);
		   }
	}
	public static int[] bubbleSortSridhar(int[] arr) {
		for(int j=0;j<arr.length;j++){
		for(int i=0;i<arr.length-1;i++){
		if(arr[i]>arr[i+1]){
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
		}
		}
		return  arr;
		}

}
