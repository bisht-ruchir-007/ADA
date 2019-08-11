package sem5;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigitsToK {

	private static Scanner sc;

	// count the number of pairs 
	private static int count(int i, int j, int k) {
		int c = 0;
		float b=1;
		while(true) {
			float a=(k-(j*b))/i;

			if( a>0 && a%1==0 ){
				c+=1;     // increment the value of c (possible case)
				System.out.println("( "+i+" , "+j+" ) => a= "+a+" b= "+b);
			}
			else if(a<=0) {
				break;
			}
			b+=1;
		}
		return c;
	}
	// count the number of triplets
	private static int count(int i, int j, int k, int s) {
		int tempcount=0;
		for(float c=1;;c++) {
			if(s-c*k<=0)
				break;
			else {
				for(float b=1;;b++) {
					if(s-(c*k+b*j)<=0)
						break;
					else {
						for(float a=1;;a++) {
							if(a*i+b*j+c*k==s) {
								System.out.println("( "+i+" , "+j+" , "+k+" ) => a="+a+
										" b="+b+" c="+c);
								tempcount+=1;
							}
							else if(a*i+b*j+c*k<s)
								continue;
							else
								break;
						}
					}
				}
			}
		}
		return tempcount;
	}

	private static void SumToK(int[] arr, int n, int k, int count) {

		Arrays.sort(arr);

		// Pairs
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int tempcount = count(arr[i],arr[j],k);
				count +=tempcount;
			}
		}
		System.out.println();
		//Triplets
		int countT=count(arr[0],arr[1],arr[2],k);
		count+=countT;

		System.out.println("\n\nans= "+count);

	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int n,k,count=0;
		System.out.println("Enter a three digit number n : ");
		n=sc.nextInt();
		System.out.println("Enter a value k: ");
		k=sc.nextInt();
		System.out.println("n = "+n+" k = "+k+"\n");
		
		int arr[]=new int[3];
		
		for(int i=0;i<3;i++) {
			arr[i]=n%10;
			n=n/10;
			if(k%arr[i]==0) {
				System.out.println("( "+arr[i]+" ) => a= "+k/arr[i]);
				count++;
			}
		}
		System.out.println();
		SumToK(arr,arr.length,k,count);

	}
}
