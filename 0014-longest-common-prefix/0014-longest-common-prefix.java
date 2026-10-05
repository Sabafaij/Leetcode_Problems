class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
        return "";
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        char[] frst=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        for(int i=0;i<frst.length;i++){
            if(frst[i]!=last[i]){
                break;
            }
            sb.append(frst[i]);
        }
        return sb.toString();
        // String prefix=strs[0];
        // for(int i=1;i<strs.length;i++){
        //     while(!strs[i].startsWith(prefix)){
        //         prefix=prefix.substring(0,prefix.length()-1);
        //         if(prefix.isEmpty()){
        //             return "";
        //         }
        //     }
        // }
        // return prefix;
    }
}