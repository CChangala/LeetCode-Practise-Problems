class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        int j =0;
        while(j<n){
            if(nums[j]!=j+1){
                result.add(nums[j]);
            }
            j++;
        }
        return result;
    }
}