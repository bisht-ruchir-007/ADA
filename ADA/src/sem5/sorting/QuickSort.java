package sorting;

public class QuickSort {

	public static void main(String[] args) {
		
		int arr[] = {5,4,3,4,6,2,1};

		System.out.print("Before Sorting : ");
		print_array(arr);
		quicksort(arr,0,arr.length-1);
		System.out.print("After Sorting : ");
		print_array(arr);

	}
	
	private static void print_array(int[] arr) {

		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();

	}

	private static void quicksort(int[] arr, int low, int high) {

		if(low<high) {
			int pivot = partition(arr,low,high);
			
			quicksort(arr, low , pivot-1 );
			quicksort(arr, pivot+1 , high);
		}

	}

	private static int partition(int[] arr, int low, int high) {

		// taking the position of pivot as last element
		int pivot = arr[high];  
        int i = (low-1); 
        
        for (int j=low; j<high; j++) 
        { 
           
            if (arr[j] < pivot) 
            { 
            	i+=1;
                // swap arr[i] arr[j] 
            	
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            
            } 
        } 
  
        // swap arr[i+1]  arr[high]
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
	}

}
