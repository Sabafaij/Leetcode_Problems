class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right=nums.length-1;
        while(mid<=right){
            if(nums[mid]==2){
                swap(nums,mid,right);
                right--;
            }
            else if(nums[mid]==0){
                swap(nums,mid,left);
                mid++;
                left++;
            }
            else{
                mid++;
            }
        }
    }
    public void swap(int[] nums,int l,int h){
        int temp=nums[l];
        nums[l]=nums[h];
        nums[h]=temp;
    }
}