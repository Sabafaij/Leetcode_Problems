class Solution {
    public boolean isHappy(int n) { 
        if(n==1){
            return true;
        } 
        if(n<4){
            return false;
        }
        Set<Integer> map=new HashSet<>();
        while(!map.contains(n) && n>4){
            map.add(n);
            n=ishappy(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    int ishappy(int n){
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp*temp;
            n/=10;
        }
        return sum;
    }
}