//For a given array of price of items,
//you have to calculate the average of all prices upto 2 decimal places.



class Compute
{
    String average(int A[], int N)
    {
        float sum=0; 
        for(int i=0;i<N;i++)
            sum+=A[i];
        sum/=N;    
        return String.format("%.2f",sum);    
    }
}

public class practicing {
	
	public static void main(String []argu) {
		Compute obj=new Compute();
		
		int arr[]= {1,2,3,3,4,5};
		
		System.out.println(obj.average(arr, arr.length));
	}
}


	[A[A[A[A[A[A[A[A[A[A[A[A[C[C[C[C[C[C[C[D[D[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[C[C[C[C[C[C[AverageInDecimal{