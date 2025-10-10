class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0; 
        int j = 0;
        int[] res = new int[n+m];
        int k = 0;
        while(i<n && j <m){
            if(nums1[i]<=nums2[j]){
                res[k] = nums1[i];
                i++; 
            }
            else{
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            res[k] = nums1[i];
            i++;
            k++;
        }
        while(j<m){
            res[k] = nums2[j];
            j++;
            k++;
        }
        int total = n + m;
        int mid = total / 2;

        if (total % 2 == 1) {
            return (double) res[mid];
        } else {
            return (res[mid - 1] + res[mid]) / 2.0;
        }
    }
}