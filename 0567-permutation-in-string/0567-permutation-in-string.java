class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        if(m>n){
            return false;
        }
        char[] s1_arr=new char[26];
        char[] s2_arr=new char[26];
        
        for(int i=0;i<m;i++){
            s1_arr[s1.charAt(i)-'a']++;
            s2_arr[s2.charAt(i)-'a']++;
        }
        for(int i=m;i<n;i++){
            
            if(Arrays.equals(s1_arr,s2_arr)){
                return true;
            }
            s2_arr[s2.charAt(i-m)-'a']--;
            s2_arr[s2.charAt(i)-'a']++;
            
        }
        // s1=sort(s1);
        // for(int i=0;i<=n-m;i++){
        //     if(s1.equals(sort(s2.substring(i,i+m)))){
        //         return true;
        //     }
        // }
        return Arrays.equals(s1_arr,s2_arr);
    }

    // public String sort(String s){
    //     char[] arr=s.toCharArray();
    //     Arrays.sort(arr);
    //     return new String(arr);
    // }
}