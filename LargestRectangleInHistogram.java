class Solution {
    public int largestRectangleArea(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]  = -1;
        right[n-1] = n;
        for(int i = 1;i<n;i++){
            int num = i-1;
            while(num >= 0 && nums[i] <= nums[num])
                num = left[num];
            left[i] = num;
        }
        
        for(int j = n-2;j>=0;j--){
            int num = j+1;
            while(num < n && nums[j] <= nums[num])
                num = right[num];
            right[j] = num;
        }
        
        int max = 0;
        for(int i = 0;i<n;i++){
            max = Math.max(max,nums[i]*(right[i]-left[i]-1));
        }
        
        return max;
    }
}
