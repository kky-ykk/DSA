// { Driver Code Starts
//  Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are //palindrome otherwise it will return 0.
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    
    public static boolean check(int n){
        int temp=n,r,sum=0;
        while(n>0)    
            {    
                r=n%10;    
                sum=(sum*10)+r;    
                n=n/10;    
            }    
            if(temp==sum)    
                return true;    
            else    
                return false;
        }
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0;i<a.length;i++){
                      if(check(a[i])){}
                      else
                        return 0;
                  }
                  return 1;
           }
}[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A
