class Solution {
    public int[] sortArray(int[] nums) {
       /**  int n = nums.length; Bubble Sort
        int min = nums[0];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;**/
        int n = nums.length;
        for(int i = n/2 -1; i>=0;i--){
            heapify(nums,n,i);
        }

        for(int i = n-1; i>0;i--){
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            heapify(nums,i,0);
        }
        return nums;
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