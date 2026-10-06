class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stk.isEmpty() && ch==')'){
                ans++;
            }
            else if(ch=='('){
                stk.push('(');
            }
            else if(stk.peek()=='('){
                stk.pop();
            }
            else{
                stk.push('(');
            }
        }
        return ans+stk.size();
    }
}