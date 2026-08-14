class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> [] bucket=new List[nums.length+1];
        for(int key:map.keySet()){
            int frequency=map.get(key);
            if(bucket[frequency] ==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] ans=new int[k];
        int idx=0;
        for(int i=bucket.length-1;i>=0 && idx<k ;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    ans[idx++]=num;
                    if(idx==k){
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}