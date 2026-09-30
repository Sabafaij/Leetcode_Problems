class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nsm=new int[n];
        int[] psm=new int[n];
        Stack<Integer> stk=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsm[i]=n;
            }
            else{
                nsm[i]=stk.peek();
            }
            stk.push(i);
        }
        stk.clear();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                psm[i]=-1;
            }
            else{
                psm[i]=stk.peek();
            }
            stk.push(i);
        }
        int max_area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area=heights[i] * (nsm[i]-psm[i]-1);
            if(max_area<area){
                max_area=area;
            }
        }
        return max_area;
    }
}