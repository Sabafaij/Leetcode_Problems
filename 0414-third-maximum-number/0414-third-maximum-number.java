class Solution {
    public int thirdMax(int[] nums) {

       long v1=Long.MIN_VALUE;
       long v2=v1,v3=v1;
       for(int i=0;i<nums.length;i++){
        if(v1==nums[i]||v2==nums[i]||v3==nums[i]) continue;
        if(nums[i]>v1){
            v3=v2;
            v2=v1;
            v1=nums[i];
        }
        else if(nums[i]>v2){
            v3=v2;
            v2=nums[i];
        }
        else if(nums[i]>v3){
            v3=nums[i];
        }
       }
       if(v3== Long.MIN_VALUE){
        return (int)v1;
       }
       return (int)v3;
    }
}