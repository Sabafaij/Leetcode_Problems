class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int frst=Integer.MIN_VALUE;
        int scnd=frst;
        int thrd=frst;
        Stack<Integer> stk=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<nums[i]){
                scnd=Math.max(scnd,nums[i]);
                thrd=stk.pop();
            }
            if(nums[i]<thrd && thrd<scnd){
                return true;
            }
            stk.push(nums[i]);
        }
        return false;
    }
}