import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] a= { 56, 23, 10, 34, 6, 111 };
		selectionSort(a);
		
	}
	static void selectionSort(int []a)
	{
		
		for (int i = 0; i < a.length-1; i++)
		{
			int min_element = i;
				for (int j = i+1; j < a.length; j++)
					if (a[j] < a[min_element])
							min_element = j;
					int temp = a[min_element];
					a[min_element] = a[i];
					a[i] = temp;
		
		}
		System.out.println("The sorted array is===>");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}

	}
}
