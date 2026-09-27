class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stk=new Stack<>();
        StringBuilder sb=new StringBuilder();
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch=arr[i];
            if(ch=='('){
                stk.push(i);
            }
            else if(ch==')'){
                reverse(arr,stk.pop(),i);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='(' & arr[i]!=')'){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
    public void reverse(char[] str,int low, int high){
        while(low<high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;
            high--;
        }
        
    }
}