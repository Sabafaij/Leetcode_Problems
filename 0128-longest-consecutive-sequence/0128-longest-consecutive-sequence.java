class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int maxLen=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,1);
        }
        for(int num:nums){
            if(map.get(num)==0) continue;
            map.put(num,0);
            int currLen=1;
            int next=num+1;
            while(map.containsKey(next) && map.get(next)==1){
                currLen++;
                
                map.put(next,0);
                next++;
            }
            int prev=num-1;
            while(map.containsKey(prev) && map.get(prev)==1){
                
                currLen++;
                map.put(prev,0);
                prev--;
            }
            maxLen=Math.max(maxLen,currLen);
        }
        return maxLen;
    }
}