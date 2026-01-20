class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int curr = 1;
        int max = 1;
        int preCmp = 0;
        
        for(int i = 1; i<n; i++){
            int cmp = Integer.compare(arr[i],arr[i-1]);

            if(cmp == 0){
                curr = 1;
            }else if(cmp*preCmp<0){
                curr++;
            }else{
                curr = 2;
            }
            max = Math.max(curr,max);
            preCmp = cmp;
        }
        return max;
    }
}