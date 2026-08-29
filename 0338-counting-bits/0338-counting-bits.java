class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        int idx=n;
        for(int i=n;i>=0;i--){
            int cnt=0;
            int j=i;
            while(j>0){
                if((j&1)==1){
                    cnt++;
                }
               j= j>>1;
            }
            ans[idx--]=cnt;
        }
        return ans;
    }
}