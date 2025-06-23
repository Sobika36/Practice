class Solution {
    public boolean isPalindrome(String s) {
        String clean=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        // int i=0;
        // int j=clean.length()-1;
        // while(i<j){
        //     if(clean.charAt(i)!=clean.charAt(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;


        StringBuilder sb=new StringBuilder(clean);
        return sb.toString().equals(sb.reverse().toString());
    }
}