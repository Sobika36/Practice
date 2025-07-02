class Solution {
    public int minimumSum(int[] nums) {
        int sum=0;
        int minSum=Integer.MAX_VALUE;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                        sum=nums[i]+nums[j]+nums[k];
                        minSum=Math.min(sum,minSum);
                        flag=true;
                    }
                }
            }
        }
        return flag?minSum:-1;
    }
}