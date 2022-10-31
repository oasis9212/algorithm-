
public class Dynamic_Programming_sol {
	public static void main(String[] args) {
		int triangle[][]= {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		int l=triangle.length;
        int[][] dp=new int[l][];

        for(int i=0;i<l;i++){
            dp[i]=new int[i+1];
        }
        for(int j=0;j<l;j++){
            for(int i=0;i<=j;i++){
                if(j==0){
                    dp[j][i]=triangle[0][0];
                }
                else if(i==0){
                    dp[j][i]=dp[j-1][i]+triangle[j][i];
                }
                else if(i==j){
                    dp[j][i]=dp[j-1][i-1]+triangle[j][i];
                }
                else{
                    dp[j][i]=Math.max(dp[j-1][i-1],dp[j-1][i])+triangle[j][i];
                }
            }
        }
		
	}
}
