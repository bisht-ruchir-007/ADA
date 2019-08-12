package sem5;
import java.util.Scanner;

public class KarastsutraMethodMultiplication {

	private static Scanner s;

	private static long mod = 1000000007;
	
	public static void main(String[] args) {

		s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		long a=s.nextLong(),b=s.nextLong();
		String A = Long.toString(a),B=Long.toString(b);
		long lenA=A.length()/2,lenB=B.length()/2;

		if(A.length()%2!=0) {
			lenA+=1;
		}
		if(B.length()%2!=0) {
			lenB+=1;
		}
		//System.out.println(lenA+" "+lenB);

		long a1=a/((long)Math.pow(10, lenA))
				,a2=a%((long)Math.pow(10, lenA))
				,b1=b/((long)Math.pow(10, lenB))
				,b2=b%((long)Math.pow(10, lenB));

		//System.out.println(a1+" "+a2+" "+b1+" "+b2);

		long x1=a1*b1*(long)Math.pow(10, lenA+lenB);
		long x2=a1*b2*(long)Math.pow(10, lenA);

		long y1=a2*b1*(long)Math.pow(10,lenB);
		long y2=a2*b2;

		long ans = (x1+x2+y1+y2)%mod;
		System.out.println(a+" * "+b+" = "+ans);

	}

}
