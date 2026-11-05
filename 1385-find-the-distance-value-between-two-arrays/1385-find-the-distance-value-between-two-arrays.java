class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt=0;
        int m=arr1.length;
        int n=arr2.length;
        for(int i=0;i<m;i++){
            boolean isValid=true;
            for(int j=0;j<n;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    isValid=false;
                    break;
                }
            }
            if(isValid){
                cnt++;
            }
        }
        return cnt;
    }
}