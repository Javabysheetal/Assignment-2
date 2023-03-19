import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
			int n,m; 
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter Main Array size==>");
		   n=sc.nextInt();
		   
		   System.out.println("Enter size of subset array==>");
		   m=sc.nextInt();
		   
		   int main_arr[]=new int[n];
		   int sub_arr[]=new int[m];
		   
		   
		   System.out.println("Enter main array elements==>");
		   for(int i=0;i<n;i++)
		     main_arr[i]=sc.nextInt();
		   int j=0;
		   System.out.println("Enter subset array elements==>");
		   for(j=0;j<m;j++)
		      sub_arr[j]=sc.nextInt();
		   
		   int flag=0; 
		   for(int i=0;i<m;i++)
		    {
		      for(j=0;j<n;j++)
		      {
		        if(sub_arr[i]==main_arr[j])
		        {
		         break;
		        }
		      }
		      if(j==n)
		      {
		      flag=1;
		      System.out.println("Given array is not a subset");
		       break;
		      }
		    } 
		  if(flag==0)
		  {
		    System.out.println("Given array is a subset of the main array");
		  }  
	}

}
