
public class BubbleSort {

	public static void main(String[] args) {
		
		 int a[] ={12,30,23,45,26,420,5};  
         
                 
         bubbleSort(a);  //method call  
          
         System.out.println("sorted array after Bubble Sort is===>");  
         for(int i=0; i < a.length; i++){  
                 System.out.print(a[i] + "\t");  
         }  }
         
         static void bubbleSort(int[] a) {  
              
             int temp = 0;  
              for(int i=0; i < a.length; i++){  
                      for(int j=1; j < (a.length-i); j++){  
                               if(a[j-1] > a[j]){  
                                        
                                      temp = a[j-1];  
                                      a[j-1] = a[j];  
                                      a[j] = temp;  
                              }  
                               
                      }  
              }  

	}

}
