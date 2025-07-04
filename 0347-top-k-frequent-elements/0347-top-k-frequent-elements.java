class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){ 
            if(hs.containsKey(nums[i])){
                hs.put(nums[i],hs.get(nums[i])+1);} 
            else{
                hs.put(nums[i],1);}
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(Map.Entry<Integer,Integer> entry:hs.entrySet()){
            int[] ara={entry.getKey(),entry.getValue()};
            pq.add(ara);
        }
        int [] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[0];
        }
        return ans;


    }
}