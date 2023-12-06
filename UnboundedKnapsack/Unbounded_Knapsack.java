package Dynamic_Programming.UnboundedKnapsack;

public class Unbounded_Knapsack {
    public static int UnboundedKnapsack(int val[],int wt[],int W) {
        int dp[][]=new int[val.length+1][W+1];
        for(int i=1;i<val.length+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[val.length][W];
    }
    public static void main(String[] args) {
        int val[] = { 10, 40, 50, 70 };
        int wt[] = { 1, 3, 4, 5 };
        int W = 8;

        int result = UnboundedKnapsack(val, wt, W);
        System.out.println("Maximum value that can be obtained: " + result);
    }

    }

