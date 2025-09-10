class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        int n=s.length();
        if(n<=10){
            return new ArrayList<>();
        }
        for(int i=0;i<=n-10;i++){
            String sub=s.substring(i,i+10);
            if(!set1.add(sub)){
                set2.add(sub);
            }
        }
        return new ArrayList<>(set2);
    }
}