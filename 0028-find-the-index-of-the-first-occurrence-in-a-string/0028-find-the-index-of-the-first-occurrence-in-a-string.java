class Solution {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        int hl=haystack.length();
        int nl=needle.length();
        if(needle.isEmpty()){
            return 0;
        }
        for(int i=0;i<=hl-nl;i++){
            boolean flag=true;
            for(int j=0;j<nl;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}