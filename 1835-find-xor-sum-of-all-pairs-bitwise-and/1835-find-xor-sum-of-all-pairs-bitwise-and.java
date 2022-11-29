class Solution {
   public int getXORSum(int[] a, int[] b) {
    int res = 0, xa = 0;
    for (var n : a)
        xa ^= n;
    for (var n : b)
        res = res ^ (xa & n);
    return res;
}
}