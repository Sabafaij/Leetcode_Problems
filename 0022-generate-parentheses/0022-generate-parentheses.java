class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper(n,list,0,0,"");
        return list;
    }
    private void helper(int n,List<String> list,int ob,int cb,String s){
        if(ob>=n && cb>=n){
            list.add(s);
            return;
        }
        if(ob<n) helper(n,list,ob+1,cb,s+'(');
        if(ob>cb) helper(n,list,ob,cb+1,s+')');
    }
}