class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int cnt=0;
        int step=10;
        while(n>0){
            cnt++;
            n-=step--;
            if(n<step){
                if(cnt%2==0){
                    return false;
                }
                return true;
            }
        }
        return true;
    }
}