//WAP to find the duplicates present in an array.
public class Program1 {

	public static void main(String[] args) {
	
		// array initialization   
	    int a[] = {1, 2, 3, 4, 5, 2, 7, 8, 7, 3,6};   
	      
	    	      
	    System.out.println("Duplicate elements in the given array are: ");  
	   
	    for(int i = 0; i < a.length; i++) {  
	        for(int j = i + 1; j < a.length; j++) {  
	            if(a[i] == a[j])  
	                System.out.println(a[j]+"\t");
	        }  
	    }  

	}

}
