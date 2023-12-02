package Dynamic_Programming;

public class Equal_Sum_Partition {
    public static boolean isSum(int arr[],int tar){
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][tar+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=tar;j++){
                int cur=arr[i-1];
                if(cur<=j && dp[i-1][j-cur]==true){
                    dp[i][j]=true;
                }
                else if(cur<=j && dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][tar];
    }
    public static boolean equalPartition(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        return isSum(arr,sum/2);
    }
    public static void main(String[] args) {
        int num[]={1,2,3,5};
        boolean ans=equalPartition(num);
        System.out.println(ans);
    }
}
