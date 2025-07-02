class Solution {
    public int strStr(String haystack, String needle) {
        int num=0;
        // for(int i=0;i<haystack.length();i++){
        //     for(int j=i;j<needle.length();j++){
        //         if(haystack.contains(needle)){
        //             return i;
        //         }
        //     }
            
        // }
        // if(haystack.contains(needle)){
        //     for(int i=0;i<haystack.length();i++){
        //         for(int j=i;j<haystack.length();j++){
        //             if(haystack.charAt(i)==haystack.charAt(j)){
        //                 return i;
        //             }
        //         }
        //     }
        // }
        // return -1;
        return haystack.indexOf(needle);
    }
}