// class Solution {
//     public int thirdMax(int[] nums) {
//         Integer max1=null;
//         Integer max2=null;
//         Integer max3=null;
//        for (Integer n : nums) {
//             if ((max1 != null && n.equals(max1)) ||
//                 (max2 != null && n.equals(max2)) ||
//                 (max3 != null && n.equals(max3))) {
//                 continue; // ✅ check null before equals
//             }
//             if(max1==null || n>max1){
//                 max3=max2;
//                 max2=max1;
//                 max1=n;
//             }
//             else if(max2==null || n>max2){
//                 max3=max2;
//                 max2=n;
//             }
//             else if(max3==null || n>max3){
//                 max1=n;
//             }
//         }
//         return max3==null?max1:max3;
//     }
// }


 import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int n : nums) {

            if (n == first || n == second || n == third) {
                continue;
            }

            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}  