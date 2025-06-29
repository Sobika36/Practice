class Solution {
    public String reverseVowels(String s) {
        // StringBuilder sb=new StringBuilder(s);
        // int start=0;
        // int end=s.length()-1;
        // while(start<end){
        //     char l=sb.charAt(start);
        //     char r=sb.charAt(end);
        //     if(l!='a' && l!='e' && l!='i' && l!='o' && l!='u' && l!='A' && l!='E' && l!='I' && l!='O' && l!='U'){
        //         start++;
        //     }
        //     else if(r!='a' && r!='e' && r!='i' && r!='o' && r!='u' && r!='A' && r!='E' && r!='I' && r!='O' && r!='U'){
        //         end--;
        //     }
        //     else{
        //         char temp=sb.charAt(start);
        //         sb.setCharAt(start,sb.charAt(end));
        //         sb.setCharAt(end,temp);
        //         start++;
        //         end--;
        //     }
        // }
        // return sb.toString();

        char []letters=s.toCharArray();
        int i=0;
        int j=letters.length-1;
        String ss="aeiouAEIOU";
        while(i<j){
            while((!ss.contains(String.valueOf(letters[i]))) && i<j){
                i++;
            }
            while((!ss.contains(String.valueOf(letters[j]))) && i<j){
                j--;
            }
            char temp=letters[i];
            letters[i]=letters[j];
            letters[j]=temp;
            i++;
            j--;
        }
        return new String(letters);
    }
}