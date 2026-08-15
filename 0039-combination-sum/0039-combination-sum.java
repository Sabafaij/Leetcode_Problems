class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        candidate(target,candidates, ans,new ArrayList<>(),0);
        return ans;
    }
    private void candidate(int target,int[] nums,List<List<Integer>> ans,List<Integer> temp,int i){
       if(target<0 || i==nums.length){
        return;
       }
       if(target==0){
        ans.add(new ArrayList<>(temp));
        return;
       }
       temp.add(nums[i]);
        candidate(target-nums[i],nums,ans,temp,i);
        temp.remove(temp.size()-1);
        candidate(target,nums,ans,temp,i+1);
    }
}