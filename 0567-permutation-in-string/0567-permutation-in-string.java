class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        s1=sort(s1);
        for(int i=0;i<=n-m;i++){
            if(s1.equals(sort(s2.substring(i,i+m)))){
                return true;
            }
        }
        return false;
    }
    public String sort(String s){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}