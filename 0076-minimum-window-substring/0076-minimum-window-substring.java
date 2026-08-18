class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        Map<Character, Integer> map=new HashMap<>();
        int minwindow=100001;
        int i_start=0;
        int i=0;
        int j=0;
        int cnt=t.length();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>0){
                cnt--;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            while(i<s.length() && cnt==0){
                int curr_window=j-i+1;
                if(curr_window<minwindow){
                    minwindow=curr_window;
                    i_start=i;
                }
                char temp=s.charAt(i);
                map.put(temp,map.getOrDefault(temp,0)+1);
                if(map.get(temp)>0){
                    cnt++;
                }
                i++;
            }
            j++;
        }
        return minwindow==100001?"" : s.substring(i_start,i_start+minwindow);
    }
}