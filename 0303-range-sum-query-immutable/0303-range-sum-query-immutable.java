class NumArray {

    int sum;
    int start;
    int end;
    NumArray left;
    NumArray right;

    public NumArray(){

    }

    public NumArray(int[] nums) {
        if(nums.length == 0){
            return;
        }
        build(nums,0,nums.length-1);
        
    }

    public void build(int[] nums, int start, int end){
        this.start = start;
        this.end = end;
        if(start == end){
            this.sum = nums[start];
            return;
        }
        int mid = start + (end - start)/2;

        this.left = new NumArray();
        this.right = new NumArray();

        this.left.build(nums, start, mid);
        this.right.build(nums, mid+1,end);
        this.sum = this.left.sum + this.right.sum;
    }
    
    public int sumRange(int l, int r) {
        if (r < start || l > end) return 0;             // no overlap
        if (l <= start && end <= r) return sum;         // total overlap
        return left.sumRange(l, r) + right.sumRange(l, r);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */