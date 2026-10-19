class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         list.add(i);
        //     }
        // }
        int cnt=0;
        int tarcnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                cnt++;
            }
            else if(nums[i]==target){
                tarcnt++;
            }
        }
        for(int i=0;i<tarcnt;i++){
            list.add(cnt+i);
        }
        return list;
    }
}