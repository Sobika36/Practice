class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int []temp=new int[Math.min(nums1.length,nums2.length)];
        int val=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    temp[val++]=nums1[i];
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int []res=new int[val];
        for(int i=0;i<val;i++){
            res[i]=temp[i];
        }
        return res;
    }
}