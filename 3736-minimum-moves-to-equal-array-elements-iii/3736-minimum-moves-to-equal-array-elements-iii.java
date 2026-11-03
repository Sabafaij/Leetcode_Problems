class Solution {
    public int minMoves(int[] nums) {
        int max=1;
        for(int num:nums){
            if(max<num){
                max=num;
            }
        }
        int ans=0;
        for(int num:nums){
            ans+=max-num;
        }
        return ans;
    }
}