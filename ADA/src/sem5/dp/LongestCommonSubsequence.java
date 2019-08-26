package dp;

public class LongestCommonSubsequence {


	public static void main(String[] args) {

		String s1 = "RUCHIR";
		String s2 = "REUFHGCGI";

		System.out.println("Length of LCS : "+Lcs(s1,s2));

	}

	private static long Lcs(String s1, String s2) {

		int m = s1.length(),n = s2.length();
		int dp[][] = new int[m+1][n+1];
		long ans=0;

		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}
				else if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}	
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}

			}
		}

		return dp[m][n];
	}

}
