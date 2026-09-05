class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        findsum(target,candidates,list,new ArrayList<>(),0);
        return list;
    }
    private void findsum(int target,int[] nums,List<List<Integer>> list,List<Integer> temp, int i){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            if(target<nums[j]) break;
            temp.add(nums[j]);
            findsum(target-nums[j],nums,list,temp,j+1);
            temp.remove(temp.size()-1);
        }
    }
}