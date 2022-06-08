//write a program to find the start index( index where the element is first found from left in the array ) and end index( index where the element is first found from right in the array ).


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int arr[]=new int[2];
        for(int i=0;i<arr.length;i++)
            arr[i]=-1;
        for(int i=0;i<N;i++)
            if(key==a[i]){
                arr[0]=i; break;
            }
        for(int i=N-1;i>=0;i--)
            if(key==a[i]){
                arr[1]=i;
                break;
            }
        return arr;
    }
