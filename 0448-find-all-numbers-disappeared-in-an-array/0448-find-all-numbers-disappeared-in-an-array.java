class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        boolean []arr=new boolean[nums.length+1];
        for(int i:nums){
            arr[i]=true;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==false){
                list.add(i);
            }
        }
        return list;
    }
}