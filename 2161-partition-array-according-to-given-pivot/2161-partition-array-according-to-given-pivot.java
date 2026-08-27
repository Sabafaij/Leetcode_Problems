class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        List<Integer>mid=new ArrayList<>();
        for(int num:nums){
            if(num<pivot){
                left.add(num);
            }
            else if(num>pivot){
                right.add(num);
            }
            else{
                mid.add(num);
            }
        }
        int idx=0;
        for(int num:left){
            nums[idx++]=num;
        }
        for(int num:mid){
            nums[idx++]=num;
        }
        for(int num:right){
            nums[idx++]=num;
        }
        return nums;
    }
}