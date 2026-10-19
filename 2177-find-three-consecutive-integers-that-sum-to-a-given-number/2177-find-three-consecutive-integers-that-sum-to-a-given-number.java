class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[0];
        }
        long ans=num/3;
        long[] arr=new long[3];
        arr[0]=ans-1;
        arr[1]=ans;
        arr[2]=ans+1;
        return arr;
    }
}