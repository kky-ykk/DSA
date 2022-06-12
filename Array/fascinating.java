import  java.util.*;

class Solution {
    StringBuffer str=new StringBuffer();
    
    boolean fascinating(long n) {
        
          String num = n + "" + (n*2) + "" + (n * 3);
      char [] str = num.toCharArray();
      char [] res = {'1','2','3','4','5','6','7','8','9'};
      Arrays.sort(str);
      if(Arrays.equals(str, res))
          return true;
       else
          return false;
    }
}

public class starpattern {

	public static void main(String[] args) {
		
		Solution s=new Solution();
		if(s.fascinating(192))
			System.out.println("Fascinatig!!");
		else
			System.out.println("Not Fascinatig!!");	
		

	}

}
[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A
