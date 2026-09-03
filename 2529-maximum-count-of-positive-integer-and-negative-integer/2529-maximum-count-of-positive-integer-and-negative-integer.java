class Solution {
    public int maximumCount(int[] nums) {
        int negCnt=0;
        int posCnt=0;
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>0){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<1){
                low=mid+1;
            }
        }
        if(ans!=-1) posCnt=nums.length-ans;
        low=0;
        high=nums.length-1;
        ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<0){
                low=mid+1;
                ans=mid;
            }
            else{
                high=mid-1;
            }
        }
        if(ans!=-1) negCnt=ans+1;
        return Math.max(negCnt,posCnt);
    }
}