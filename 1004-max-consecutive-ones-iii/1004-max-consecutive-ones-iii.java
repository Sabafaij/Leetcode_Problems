class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int zeroCnt = 0;
        int idx=0;
        while(idx<nums.length){
            if(nums[idx]==0){
                zeroCnt++;
            }
            while(zeroCnt>k){
                if(nums[left++]==0){
                    zeroCnt--;
                }
            }
            maxLen=Math.max(maxLen,idx-left+1);
            idx++;
        }
        return maxLen;
    }
}