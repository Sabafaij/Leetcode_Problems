class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] ans=new int[n];
        Stack<Integer>stk=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && heights[i]>stk.peek()){
                ans[i]++;
                stk.pop();
            }
            if(!stk.isEmpty()){
                ans[i]++;
            }
            stk.push(heights[i]);
        }
        return ans;
    }
}