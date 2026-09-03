class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        for(int[] nums:grid){
            cnt+=negCount(nums);
        }
        return cnt;
    }
    public int negCount(int[] nums){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<0){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return (ans!=-1)?nums.length-ans:0;
    }
}