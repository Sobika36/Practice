class Solution {
    public long removeZeros(long n) {
        String res=String.valueOf(n).replace("0","");
        return Long.parseLong(res);
    }
}