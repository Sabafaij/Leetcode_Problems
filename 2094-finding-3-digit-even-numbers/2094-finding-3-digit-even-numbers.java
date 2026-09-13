class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> map=new HashSet<>();
        int[] digit=new int[10];
        for(int n:digits){
            digit[n]++;
        }
        for(int i=1;i<=9;i++){
            if(digit[i]==0) continue;
            digit[i]--;
            for(int j=0;j<=9;j++){
                if(digit[j]==0) continue;
                digit[j]--;
                for(int k=0;k<9;k+=2){
                    if(digit[k]==0) continue;
                    int num=i*100+j*10+k;
                    map.add(num);
                }
                digit[j]++;
            }
            digit[i]++;
        }
        int[] ans=new int[map.size()];
        int i=0;
        for(int n:map){
            ans[i++]=n;
        }
        Arrays.sort(ans);
        return ans;
    }
}