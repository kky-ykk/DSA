public class greaterInFourNum {

	public static void main(String[] args) {
		int a=10,b=12,c=0,d=20;
		
		int result=(a>b)?(a>c)?(a>d)?a:b:(c>d)?c:d:(b>c)?(b>d)?b:d:(c>d)?c:d;
		System.out.println(result);
	}

}
