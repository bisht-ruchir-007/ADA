package sem5;
import java.util.*;

/* 
 *    LARUSE METHOD
 */

public class Mul_Method_1 {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		long a=s.nextLong(),b=s.nextLong();

		System.out.println("By direct calculation : product = "+a*b);

		if(b>a) {              // Swapping the numbers
			long temp=b;
			b=a;
			a=temp;
		}
		long  ans=0;
		while(b>=1) {
			b= b/2 ;
			a*=2;
			if(b%2!=0)
				ans+=a;
		}
		System.out.println("By the method : product = "+ans);

	}

}
