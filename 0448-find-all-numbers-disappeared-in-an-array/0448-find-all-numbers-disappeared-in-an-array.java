class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        while(i<n){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp = arr[correct];
                arr[correct]= arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        int j = 0;
        while(j<n){
            if(arr[j]!=j+1){
                res.add(j+1);
            }
            j++;
        }

        return res;
        
    }
}