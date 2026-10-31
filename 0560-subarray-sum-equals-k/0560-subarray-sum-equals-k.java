class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        int[] prefsum=new int[nums.length];
        prefsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefsum[i]=prefsum[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(prefsum[i]==k) cnt++;
            int target=prefsum[i]-k;
            if(map.containsKey(target)){
                cnt+=map.get(target);
            }
            map.put(prefsum[i],map.getOrDefault(prefsum[i],0)+1);
        }
        return cnt;   
    }
}