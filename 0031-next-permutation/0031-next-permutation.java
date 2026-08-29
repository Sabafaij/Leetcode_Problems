class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx=i-1;
                break;
            }
        }
        if(idx!=-1){
            for(int i=nums.length-1;i>idx;i--){
                if(nums[idx]<nums[i]){
                    swap(nums,idx,i);
                    break;
                }
            }
        }
        reverse(nums,idx+1);
    }
    public void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int[] arr,int start){
        int end=arr.length-1;
        while(end>start){
            swap(arr,start,end);
            end--;
            start++;
        }
    }
}