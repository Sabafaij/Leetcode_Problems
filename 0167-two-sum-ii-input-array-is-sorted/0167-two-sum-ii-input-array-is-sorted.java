class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int [] arr=new int[2];
        int low=0;
        int high=nums.length-1;
        while(low<high){
            if(nums[low]+nums[high]==target){
                arr[0]=low+1;
                arr[1]=high+1;
            }
            if(nums[low]+nums[high]>target){
                high--;
            }
            else{
                low++;
            }
        }
        return arr;
    }
}