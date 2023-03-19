
import java.util.Arrays;

class Quick {

  // method to find the partition position
  static int partition(int ar[], int start, int end) {
	  int i = (start - 1);
    
    int pivot = ar[end];
    

    // traverse through all elements
    // compare each element with pivot
    for (int j = start; j < end; j++) {
      if (ar[j] <= pivot) {

        
        i++;
        // swapping logic
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
      }

    }

    // swap the pivot element 
    int temp = ar[i + 1];
    ar[i + 1] = ar[end];
    ar[end] = temp;

    return (i + 1);
  }

  static void quickSort(int ar[], int start, int end) {
    if (start < end) {

      // find pivot element such that
      // elements smaller than pivot are on the left
      // elements greater than pivot are on the right
      int pi = partition(ar ,start, end);
      
      // recursive call on the left of pivot
      quickSort(ar, start, pi - 1);

      // recursive call on the right of pivot
      quickSort(ar, pi + 1, end);
    }
  }
}


public class QuickSort {
  public static void main(String args[]) {

	  //array initilization
    int[] array = { 88, 71, 12, 11, 40, 99, 61 };
    System.out.println("Given Array is :==>");
    System.out.println(Arrays.toString(array));

    	//call the method
       Quick.quickSort(array, 0, array.length - 1);

    System.out.println("Sorted Array in Ascending Order is===> ");
    System.out.println(Arrays.toString(array));
  }
}