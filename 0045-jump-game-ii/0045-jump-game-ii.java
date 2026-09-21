class Solution {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int step=0;
        int currpos=0;
        int maxs=0;
        for(int i=0;i<nums.length-1;i++){
            maxs=Math.max(maxs,i+nums[i]);
            if(currpos==i){
                step++;
                currpos=maxs;
            }
        }
        return step;
    }
}