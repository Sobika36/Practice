class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char l=sb.charAt(start);
            char r=sb.charAt(end);
            if(l!='a' && l!='e' && l!='i' && l!='o' && l!='u' && l!='A' && l!='E' && l!='I' && l!='O' && l!='U'){
                start++;
            }
            else if(r!='a' && r!='e' && r!='i' && r!='o' && r!='u' && r!='A' && r!='E' && r!='I' && r!='O' && r!='U'){
                end--;
            }
            else{
                char temp=sb.charAt(start);
                sb.setCharAt(start,sb.charAt(end));
                sb.setCharAt(end,temp);
                start++;
                end--;
            }
        }
        return sb.toString();
    }
}