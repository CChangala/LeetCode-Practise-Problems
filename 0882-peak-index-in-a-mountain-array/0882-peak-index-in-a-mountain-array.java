class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 1;
        int e = n-1;
        int ans = 0;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }

            else if(arr[mid]<arr[mid+1]){
                s = mid+1;
            }
            else{
                e = mid;
            }

        }
        return e;
    }
}