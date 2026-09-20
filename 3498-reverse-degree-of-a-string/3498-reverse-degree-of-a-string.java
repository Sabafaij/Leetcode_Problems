class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=1;i<=s.length();i++){
            char ch=s.charAt(i-1);
            int reverse='z'-ch+1;
            ans+=i*reverse;
        }
        return ans;
    }
}