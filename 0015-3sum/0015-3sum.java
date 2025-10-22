class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int j=0;j<n-2;j++){
            if(j>0 && nums[j]==nums[j-1]){
                continue;
            }
            int left=j+1,right=n-1;
            while(left<right){
                int sum=nums[j]+nums[left]+nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[j],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
}