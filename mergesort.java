// java program for merge sort
import java.util.*;
class MergeSort {

	//merge sort function
	public static void mergeSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2; 
		int[] l = new int[mid]; 
		int[] r = new int[n - mid]; 

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}
	public static void merge(
			int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			}
			else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
			a[k++] = l[i--]; 
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

	
	static void printArray(int arr[])
	{
		
		for (int i = 0; i <  arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		// taking input
		Scanner sc=new Scanner(System.in);
		
		int p=sc.nextInt();
		
		int[] arr = new int[p];  
		for(int i=0; i<p; i++)  
        {  
        	arr[i]=sc.nextInt();  
        }

		System.out.println("Given Array: ");
		printArray(arr);
		mergeSort(arr, p);
		System.out.println("\nSorted array");
		printArray(arr);
	}
}

/* This code is contributed by shakti Singh */
