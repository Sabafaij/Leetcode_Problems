class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long left=0;
        long right=0;
        for(int i=0;i<nums.length/2;i++){
            left+=nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++){
            right+=nums[i];
        }
        return right-left;
    }
}