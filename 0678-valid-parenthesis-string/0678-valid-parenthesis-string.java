class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stk=new Stack<>();
        Stack<Integer> stk_s=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stk.push(i);
            }
            else if(ch==')'){
                if(!stk.isEmpty()){
                    stk.pop();
                }
                else if(!stk_s.isEmpty()){
                    stk_s.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stk_s.push(i);
            }
        }
        while(!stk.isEmpty() && s.charAt(stk.peek())=='(' && !stk_s.isEmpty()){
            if(stk_s.peek()>stk.peek()){
                stk_s.pop();
                stk.pop();
            }
            else{
                return false;
            }
        }
        return stk.isEmpty();
    }
}