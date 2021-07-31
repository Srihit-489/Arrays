class Solution {
    public int trap(int[] height) {
        if(height.length == 0){
            return 0;
        }
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        int max = height[0];
        for(int i=1;i<n;i++){
            max = Math.max(max,height[i]);
            left[i] = max;
        }
        max = height[n-1];
        for(int i = n-2;i>= 0;i--){
            max = Math.max(max,height[i]);
            right[i] = max;
        }
        
        int sum = 0;
        for(int i=1;i<n-1;i++){
            sum = sum + (Math.min(left[i],right[i]) - height[i]);
        }
        return sum;
        
    }
}
