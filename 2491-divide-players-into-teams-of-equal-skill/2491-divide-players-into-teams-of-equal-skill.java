class Solution {
    public long dividePlayers(int[] skill) {
        long sum=0;
        for(int num : skill){
            sum+=num;
        }
        int team=skill.length/2;
        if(sum%team!=0){
            return -1;
        }
        long ans=0;
        int target=(int)sum/team;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:skill){
            int complement = target - num;
            if (map.getOrDefault(complement, 0) > 0) {
                ans += (long) num * complement;
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        for (int count : map.values()) {
            if (count != 0) return -1;
        }
        return ans;
    }
}