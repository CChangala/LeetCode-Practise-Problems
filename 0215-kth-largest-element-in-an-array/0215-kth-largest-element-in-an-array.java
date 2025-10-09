class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for(int i = n/2 -1; i>=0;i--){
            heapify(nums,n,i);
        }
        for (int i = n - 1; i >= n - k + 1; i--) {
            // swap root (max) with last element in current heap
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // re-heapify reduced heap
            heapify(nums, i, 0);
        }

        // Step 3: root now contains the kth largest element
        return nums[0];

    }
    public void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i +1;
        int right = 2*i +2;
        if(left<n && arr[largest]<arr[left]){
            largest = left;
        }
        if(right<n && arr[largest]<arr[right]){
            largest = right;
        }

        if(largest!=i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr,n,largest);
        }

    }
}