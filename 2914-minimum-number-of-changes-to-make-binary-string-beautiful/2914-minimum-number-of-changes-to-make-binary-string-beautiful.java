class Solution {
    public int minChanges(String s) {
        int change=0;
        int cnt=0;
        int n=s.length();
        int left=0;
        while(left<n){
            char curr_ch=s.charAt(left);
            cnt=1;
            int next=left+1;
            while(next<n && curr_ch==s.charAt(next)){
                cnt++;
                next++;
            }
            if(cnt%2==1){
                change++;
                next++;
            }
            left=next;
        }
        return change;
    }
}