// find average or mean of the stream at every point.the function streamAvg() which takes the array of integers arr and n as input parameters and returns an array of type float denoting the average at every point in the stream. 


import  java.util.*;

class Solution {
    float[] streamAvg(int[] arr, int n) {
        // code here
        float a[]=new float[n];
        float sum=0;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            a[i]=sum/(i+1);
        }
        
        return a;
    }
}

public class AverageStream {
	public static void main(String[] args) {
		
		Solution obj=new Solution();
		
		
		int arr[]={1,2,3,3,4};
		float[] ar=obj.streamAvg(arr,arr.length);
		
		for(float ele:ar)
			System.out.println(ele);
			

	}

}
