class Solution {
    public String addBinary(String a, String b){
        StringBuilder sb=new StringBuilder();
        int al=a.length()-1;
        int bl=b.length()-1;
        int carry=0;
        while(al>=0 || bl>=0){
            int sum=0;
            if(al>=0){
                sum=a.charAt(al)-'0';
                al--;
            }
            if(bl>=0){
                sum+=b.charAt(bl)-'0';
                bl--;
            }
            sum+=carry;
            if(sum==2){
                sb.append(0);
                carry=1;
            }
            else if(sum==3){
                sb.append(1);
                carry=1;
            }
            else{
                sb.append(sum);
                carry=0;
            }
        }
        if(carry==1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}