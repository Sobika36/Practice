class Solution {
    public String convertToTitle(int columnNumber) {
        ArrayList<Character> list=new ArrayList<>();
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            list.add((char)(rem+'A'));
            columnNumber/=26;
        }
        Collections.reverse(list);
        StringBuilder sb=new StringBuilder();
        for(char ch:list){
            sb.append(ch);
        }
        return sb.toString();
    }
}