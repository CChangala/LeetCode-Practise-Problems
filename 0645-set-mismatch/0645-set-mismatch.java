class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] res = new int[2];
        int i = 0;
        while(i<n){
            int correct = nums[i] - 1;
            if(correct<n && nums[i]!=nums[correct]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }

        int j = 0;
        while(j<n){
            if(nums[j]!=j+1){
                res[1]=j+1;
                res[0]=nums[j];
                break;
            }
            j++;
        }
        return res;
        
    }
}