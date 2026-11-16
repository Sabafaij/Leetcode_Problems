class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb=new StringBuilder();
        while(s.length()>k){
            for(int i=0;i<s.length();i+=k){
                int sum=0;
                for(int j=0;j<k && i+j <s.length();j++){
                    sum+=(s.charAt(i+j)-'0');
                }
                sb.append(sum);
            }
            s=sb.toString();
            sb.setLength(0);
        }
        return s;
    }
}