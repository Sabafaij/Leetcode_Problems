class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk=new Stack<>();
        int maxparan=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stk.push(ch);
            }
            else if(ch==')'){
                stk.pop();
            }
            maxparan=Math.max(stk.size(),maxparan);
        }
        return maxparan;
    }
}