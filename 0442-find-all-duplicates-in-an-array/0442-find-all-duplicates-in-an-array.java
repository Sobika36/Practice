class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int n:nums){
            if(hs.contains(n)){
                ans.add(n);
            }
            hs.add(n);
        }
        return ans;
    }
}