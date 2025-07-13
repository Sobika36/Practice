class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set=new HashSet<>();
        int freq[]=new int[2001];
        for(int i:arr){
            freq[1000+i]++;
        }
        for(int i:freq){
            if(i>0){
                if(set.contains(i))return false;
                set.add(i);
            }
        }
        return true;
    }
}