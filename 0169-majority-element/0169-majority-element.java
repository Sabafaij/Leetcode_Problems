class Solution {
    public int majorityElement(int[] nums) {
        int key=nums[0];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            
            if(key==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt==0){
                key=nums[i];
                cnt=1;
            }
        }
        return key;
    }
}