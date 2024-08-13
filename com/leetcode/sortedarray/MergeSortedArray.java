import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        nums1 = Arrays.copyOf(nums2, m+n);
    
        

        Arrays.sort(nums1);

        StringBuffer sb = new StringBuffer().append("[");
        for (int i =0;i< nums1.length;i++) {
            sb.append(nums1[i]).append(",");
        }
        sb.append("]");

       String resulString = sb.toString().replace(sb.substring(sb.length()-2), "");
        System.out.println(resulString+"]");
        

    }
}

class MergeSortedArray {
    public static void main(String[] args) {
        int[] list1 = { 1, 2, 3, 0, 0, 0 };
        int[] list2 = { 2, 5, 6 };
        Solution solution = new Solution();
        solution.merge(list1, 3, list2, 3);
    }
}