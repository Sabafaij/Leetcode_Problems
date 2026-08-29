class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        if((n&(n-1))==0){
            return true;
        }
        return false;
        // for(int i=0;i<=n;i++){
        //     if(Math.pow(2,i)==n){
        //         return true;
        //     }
        //     else if(Math.pow(2,i)>n){
        //         return false;
        //     }
        // }
        // return false;
    }
}