class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        List<String> list=new ArrayList<>();
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i)==s.charAt(i-1) && s.charAt(i)==' '){
                idx=i+1;
                continue;
            }
            if(s.charAt(i)==' '){
                list.add(s.substring(idx,i));
                idx=i+1;
            }
        }
        list.add(s.substring(idx,s.length()));
        StringBuilder sb=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            sb.append(list.get(i));
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}