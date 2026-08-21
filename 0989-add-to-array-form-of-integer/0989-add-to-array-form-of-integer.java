class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();

        int i = nums.length - 1;
        int carry = k;

        while (i >= 0 || carry > 0) {

            if (i >= 0) {
                carry += nums[i];
                i--;
            }

            list.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(list);

        return list;
    }
}