class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> map=new HashSet<>();
        for(int num:nums){
            map.add(num);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.contains(i*k)){
                return i*k;
            }
        }
        return (nums.length+1)*k;
    }
}