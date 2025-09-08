class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        boolean flag=false;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i:map.values()){
            if(i%2==0){
                count+=i;
            }
            else{
                count+=i-1;
                flag=true;
            }
        }
        if(flag)
            return ++count;
        else
            return count;
        
    }
}