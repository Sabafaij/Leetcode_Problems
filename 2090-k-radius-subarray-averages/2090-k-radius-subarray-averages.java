class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k==0){
            return nums;
        }
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.fill(arr,-1);
        long windowSize=2L*k+1;
        if(n<windowSize){
            return arr;
        }
        long sum=0;
        for(int i=0;i<windowSize;i++){
            sum+=nums[i];
        }
        for(int i=k;i<n-k;i++){
            arr[i]=(int)(sum/(windowSize));
            if(i<n-k-1){
                sum+=nums[i+k+1]-nums[i-k];
            }
        }
        return arr;
    }
}