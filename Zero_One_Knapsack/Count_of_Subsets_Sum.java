package Dynamic_Programming.Zero_One_Knapsack;

public class Count_of_Subsets_Sum {
    public static int isSum(int arr[],int tar){
        int n=arr.length;
         int dp[][]=new int[arr.length+1][tar+1];
        // i =item and j =target sum
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<tar+1;j++){
                int cur=arr[i-1];
                //include
                if(cur<=j){
                    dp[i][j]=dp[i-1][j-cur] + dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[n][tar];
    }
    public static void main(String[] args) {
        int num[]={4,2,7,1,3};
        int targetSum=10;
        int ans=isSum(num,targetSum);
        System.out.println(ans);

    }
}
