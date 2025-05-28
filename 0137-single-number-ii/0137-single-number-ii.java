class Solution {
    public int singleNumber(int[] arr) {
    int ones = 0, twos = 0;
    for (int i : arr) {
        ones = (ones ^ i) & ~twos;
        twos = (twos ^ i) & ~ones;
    }
    return ones;
}
}