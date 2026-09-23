class Solution {
    public int minOperations(int[] nums, int x) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            map.put(sum,i);
        }
        if(sum<x){
            return -1;
        }
        int remaining=sum-x;
        sum=0;
        if(remaining==0){
            return nums.length;
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int find=sum-remaining;
            if(map.containsKey(find)){
                ans=Math.max(ans,i-map.get(find));
            }
        }
        return ans==Integer.MIN_VALUE?-1:nums.length-ans;
    }
    
}