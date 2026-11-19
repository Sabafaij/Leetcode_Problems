class Solution {
    public boolean canJump(int[] nums) {
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i>max){
        //         return false;
        //     }
        //     max=Math.max(max,i+nums[i]);
        // }
        // return true;
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            if(curr==0){
                return false;
            }
            curr=Math.max(--curr,nums[i]);
        }
        return true;
    }    
}