import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] a= { 56, 23, 10, 34, 6, 111 };

	   
	    // pass argument: array, first index and last index
	    mergeSort(a, 0, a.length - 1);

	    //print sorted array
	    System.out.println("The Sorted Array is===>");
	    System.out.println(Arrays.toString(a));
	}
	
	// Divide the array into two sub arrays, sort them and merge them
	static void mergeSort(int array[], int left, int right) {
	    if (left < right) {

	      // m is the point where the array is divided into two sub arrays
	      int mid = (left + right) / 2;

	      // recursive call to each sub arrays
	      mergeSort(array, left, mid);
	      mergeSort(array, mid + 1, right);

	      // Merge the sorted sub arrays
	      merge(array, left, mid, right);
	    }
	  }
	// Merge two sub arrays L and M into array
	static void merge(int a[], int p, int q, int r) {

	    int n1 = q - p + 1;
	    int n2 = r - q;

	    int L[] = new int[n1];
	    int M[] = new int[n2];

	    for (int i = 0; i < n1; i++)
	      L[i] = a[p + i];
	    for (int j = 0; j < n2; j++)
	      M[j] = a[q + 1 + j];

	    int i, j, k;
	    i = 0;
	    j = 0;
	    k = p;

	    while (i < n1 && j < n2) {
	      if (L[i] <= M[j]) {
	        a[k] = L[i];
	        i++;
	      } else {
	        a[k] = M[j];
	        j++;
	      }
	      k++;
	    }

	    while (i < n1) {
	      a[k] = L[i];
	      i++;
	      k++;
	    }

	    while (j < n2) {
	      a[k] = M[j];
	      j++;
	      k++;
	    }
	  }

	}
