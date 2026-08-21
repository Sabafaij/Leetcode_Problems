class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int[] s_arr=new int[26];
        int[] p_arr=new int[26];
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            p_arr[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            s_arr[ch-'a']++;
            if(i>=p.length()){
                s_arr[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(s_arr,p_arr)){
                list.add(i-p.length()+1);
            } 
        }
        return list;
    }
}