class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<n){
            int correct = arr[i];
            if(correct<n && arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        int ans = -1;
        int j = 0;
        while(j<n){
            if(arr[j]!=j){
                return j;
            }
            j++;
        }
        
        return j;
    }
}