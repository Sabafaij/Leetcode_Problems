class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int max=0;
        int min=0;
        for(int i=1;i<nums.length;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
            if(nums[min]>nums[i]){
                min=i;
            }
        }
        int leftmin=Math.max(min,max);
        int rightmin=nums.length-Math.min(min,max);
        min=Math.min(min+1,nums.length-min);
        max=Math.min(max+1,nums.length-max);
        return Math.min(max+min,Math.min(leftmin+1,rightmin));
    }
}