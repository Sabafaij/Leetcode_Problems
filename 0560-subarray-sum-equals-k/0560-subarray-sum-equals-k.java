class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        Map<Integer,Integer> map=new HashMap<>();
        int[] prefsum=new int[nums.length];
        prefsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefsum[i]=prefsum[i-1]+nums[i];
        }
        for(int i=0;i<prefsum.length;i++){
            int num=prefsum[i];
            if(k==num) cnt++;
            if(map.containsKey(num-k)){
                cnt+=map.get(num-k);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return cnt;
    }
}