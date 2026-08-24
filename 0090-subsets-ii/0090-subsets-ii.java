class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> set=new ArrayList<>();
        Arrays.sort(nums);
        sets(set,new ArrayList<>(),nums,0);
        return set;
    }
    private void sets(List<List<Integer>> set,List<Integer> temp,int[] nums,int start){
        set.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i-1]==nums[i]) continue;
            temp.add(nums[i]);
            sets(set,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}

