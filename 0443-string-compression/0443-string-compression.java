class Solution {
    public int compress(char[] chars) {
        int idx=0;
        int n=chars.length;
        int i=0;
        while(i<n){
            int cnt=0;
            char curr_char=chars[i];
            while(i<n &&chars[i]==curr_char){
                i++;
                cnt++;
            }
            chars[idx++]=curr_char;
            if(cnt>1){
                String count=String.valueOf(cnt);
                for(char ch:count.toCharArray()){
                    chars[idx++]=ch;
                }
            }
        }
        return idx;
    }
}