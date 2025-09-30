class Solution {
    static int pivotElement(int[] nums){
        int n = nums.length;
        int s = 0, e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // check if mid is pivot
            if (mid < e && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > s && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // move search space
            if (nums[mid] >= nums[s]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 1) return nums[0] == target ? 0 : -1;

        int pivot = pivotElement(nums);

        // if no rotation
        if (pivot == -1) {
            return binarySearch(nums, 0, n - 1, target);
        }

        // if target is pivot
        if (nums[pivot] == target) return pivot;

        // decide which side to search
        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else {
            return binarySearch(nums, pivot + 1, n - 1, target);
        }
    }

    private int binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
}
