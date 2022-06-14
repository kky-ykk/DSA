//Given a non-empty sequence of characters str, return true if sequence is Binary, else return false
class string
{
	boolean isBinary(String str)
	{
	  //Your code here
// 	  for(int i=0;i<str.length();i++){
// 	    if  (str.charAt(i)!='0' && str.charAt(i)!='1')
// 	        return false;
	      
// 	  }
// 	  return true;

    //-----------or-------------------
    char str1[]=str.toCharArray();
     for(char c:str1 ){
	    if  (c!='0' && c!='1')
	        return false;
	      	  }
	  return true;


	}
}
