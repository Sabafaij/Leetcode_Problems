class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int[] num:dp){
            Arrays.fill(num,-1);
        }
        return subSequence(s,t,0,0,dp);
    }
    public int subSequence(String s, String t, int i,int j,int[][] dp){
        if(j==t.length()){
            return dp[i][j]=1;
        }
        if(i==s.length()){
            return dp[i][j]=0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]= subSequence(s,t,i+1,j+1,dp)+subSequence(s,t,i+1,j,dp);
        }
        else{
            return dp[i][j]=subSequence(s,t,i+1,j,dp);
        }
    }
}