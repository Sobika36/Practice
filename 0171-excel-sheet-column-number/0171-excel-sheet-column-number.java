class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        int val=0; 
        for(char c:columnTitle.toCharArray()){
            // sum*=26;
            // val=1+(c-'A');
            // sum+=val;
            sum=sum*26+(c-'A'+1);
        }
        return sum;
    }
}