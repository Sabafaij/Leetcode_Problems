class Solution {
    public int trap(int[] height) {
        int ans=0;
        int n=height.length;
        if(height.length<=1){
            return 0;
        }
        int[] right=new int[height.length];
        int[] left=new int[height.length];
        left[0]=height[0];
         right[n-1]=height[n-1];
        for(int i=1,j=n-2;i<n && j>=0;i++,j--){
            left[i]=Math.max(left[i-1],height[i]);
            right[j]=Math.max(right[j+1],height[j]);
        }
        // right[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //     right[i]=Math.max(right[i+1],height[i]);
        // }
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i],right[i])-height[i];
        }
        return ans;
    }
}