//Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().seriesSum(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        return (long)n*((long)n+1)/2;
    }
}[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[C[B[B[B[C[C[C[C[C[CS
