package Dynamic_Programming;

public class _0_1_knapsack_tabulation {
    public static int Knapsack_tabulation(int val[],int wt[],int W){
        int dp[][]=new int[val.length+1][W+1];
        for(int i =0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i =0;i<dp.length;i++){
            dp[0][i]=0;
        }
      for(int i=0;i<dp.length+1;i++){
          for(int j=0;j<W+1;j++){
        int v=val[i-1];
        int w=wt[i-1];
          }
      }
      return 1;
    }

    public static void main(String[] args) {

    }
}
