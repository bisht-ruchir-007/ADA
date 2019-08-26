package package_name;

public class MergeSort {

  /*
      Time Complexity = O(nlogn)
  
  */
	public static void main(String[] args) {

		int arr[] = {5,4,3,4,6,2,1};

		System.out.print("Before Sorting : ");
		print_array(arr);
		mergesort(arr,0,arr.length-1);
		System.out.print("After Sorting : ");
		print_array(arr);
		
	}
  // Printing the array 
	private static void print_array(int[] arr) {

		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();

	}
  
	private static void mergesort(int[] arr, int start, int end) {
		if(start<end) {
			
			int mid = (start+end)/2;
			
			mergesort(arr,start,mid);  // sort the first part
			mergesort(arr,mid+1,end);  // sort the second part
			
			merge(arr,start,mid,end);  // merging the two sub-arrays 
			
		}

	}

	private static void merge(int[] arr, int start, int mid, int end) {

		int p =start ,q=mid+1,k=0;
		
		int a[] = new int[end-start+1];
		
		for( int i=start; i <= end ; i++ ) {
			if(p>mid) {     //checks if first part comes to an end or not .
				a[k++]=arr[q++];
			}
			else if(q>end) {   //checks if second part comes to an end or not .
				a[k++]=arr[p++];
			}
			else if (arr[p]<arr[q]) {
				a[k++]=arr[p++];
			}
			else {
				a[k++]=arr[q++];
			}
		}

		// updating in the originastartarray ie arr[]
		
		for(int i=0;i<k;i++) {
			arr[start++]=a[i];
		}

	}

}
