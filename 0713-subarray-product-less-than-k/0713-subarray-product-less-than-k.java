class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int cnt=0;
        int idx=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            while(idx<nums.length && product>=k){
                product/=nums[idx++];
            }
            cnt+=i-idx+1;
        }
        return cnt;
    }
}