class Solution {
    public int numOfWays(int n) {
        long aba = 6;
        long abc = 6;
        long mod = 1000000007;
        for (int i = 2; i <= n; i++) {
            long next_aba = (aba * 3 + abc * 2) % mod;
            long next_abc = (aba * 2 + abc * 2) % mod; 
            aba = next_aba;
            abc = next_abc;
        }
        return (int)((aba + abc) % mod);
    }
}