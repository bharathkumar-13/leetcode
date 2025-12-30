import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] nums1=new int[m+n];
        int k=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[k];
            k++;
        }
        // int k=i;
        // for(int j=0;j<n;j++){
        //     nums1[k]=nums2[j];
        // }
        Arrays.sort(nums1);

        
    }
}