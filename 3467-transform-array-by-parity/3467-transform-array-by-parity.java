class Solution {
    public int[] transformArray(int[] nums) {
        int[] arr=new int[nums.length];
        int s=0;
        int e=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[s++]=0;
            }
            else{
                arr[e--]=1;
            }
        }
        return arr;
    }
}