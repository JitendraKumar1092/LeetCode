class Solution {
    static StringBuilder reverse(String st) {
        return new StringBuilder(st).reverse();
    }

    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += k * 2) {
            int end = Math.min(i + k, s.length());
            sb.append(reverse(s.substring(i, end)));
            sb.append(s.substring(end, Math.min(i + 2 * k, s.length())));
        }
        return sb.toString();
    }
}
