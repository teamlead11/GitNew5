package testpack;





public class BaseClass1 {

	 void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	 
	    /* Prints the array */
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	    // Driver method to test above
	    public static void main(String args[])
	    {
	    	BaseClass1 ob = new BaseClass1();
	        int arr[] = {64, 34, 25, 12, 22, 11, 90};
	        ob.bubbleSort(arr);
	        System.out.println("Resolved by - Manivannan");
	        ob.printArray(arr);
	    }
}	









public class BaseClass {
	
	
	public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
  
        System.out.println("kalaislevan");
		System.out.println("abc");
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
    }

<<<<<<< HEAD
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
=======
		
	}
   
	
>>>>>>> 79b420703e1d8be6c21f005859170d5d9bc00410

