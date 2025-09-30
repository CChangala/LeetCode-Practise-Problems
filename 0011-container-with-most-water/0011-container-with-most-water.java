class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int s = 0;
        int e = height.length-1;
        while(s<e){
            max = Math.max(max, Math.min(height[s],height[e])*(e-s));
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return max;
    }
}