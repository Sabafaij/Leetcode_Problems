class Solution {
    public int countSubstrings(String s) {
        int cnt=0;
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(check(s,i,j,dp)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    private boolean check(String s,int i,int j,boolean[][] dp){
        if(i>=j) return true;
        if(dp[i][j]) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=check(s,i + 1 ,j-1 ,dp);
        }
        return dp[i][j];
    }
}