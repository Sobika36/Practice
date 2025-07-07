class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int[] pCount=new int[26];
        int[] windowCount=new int[26];
        int windowSize=p.length();
        for(int i=0;i<p.length();i++){
            pCount[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            windowCount[s.charAt(i)-'a']++;
            if(i>=windowSize){
                windowCount[s.charAt(i-windowSize)-'a']--;
            }
            if(Arrays.equals(pCount,windowCount)){
                result.add(i-windowSize+1);
            }
        }
        return result;
    }
}