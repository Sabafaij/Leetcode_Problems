class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int num:answers){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(key==0){
                ans+=map.get(key);
            }
            else if(key+1<map.get(key)){
                if(map.get(key)%(key+1)==0){
                    ans+=(key+1)*map.get(key)/(key+1);
                }
                else{
                    ans+=(key+1)*(map.get(key)/(key+1)+1);
                }
            }
            else{
                ans+=key+1;
            }
        }
        return ans;
    }
}