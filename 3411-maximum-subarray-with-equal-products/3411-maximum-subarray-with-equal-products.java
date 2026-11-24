class Solution {
    public int maxLength(int[] nums) {
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            long prod = 1;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];
                gcd = GCD(gcd, nums[j]);
                lcm = LCM(lcm, nums[j]);

                if (prod == lcm * gcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

                // Optimization: max possible LCM for numbers 1..10 is 2520,
                // and max GCD is 10. If prod exceeds 25200, it can never match again.
                if (prod > 25200) {
                    break;
                }
            }
        }

        return maxLen;
    }

    public long GCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public long LCM(long a, long b) {
        return (a / GCD(a, b)) * b;
    }
}