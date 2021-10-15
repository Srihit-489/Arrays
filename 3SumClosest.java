class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closest = 999999999 - target;
        int ans = 999999999;
        Arrays.sort(nums);
        for(int i = 0;i<n-2;i++){
            int start = i+1;
            int end = n-1;
            int sum = nums[start]+ nums[end]+nums[i];
            while(sum != target && start < end){
                int close = Math.abs(sum - target);
              //  System.out.println("sum is"+sum+" close is "+close);
                if(close < closest){
                   
                    
                   // System.out.println("Prev ans"+ans);
                    ans = sum;
                   // System.out.println("After ans"+ans);
                    closest = close;
                }
                if(sum < target)
                    start++;
                else
                    end--;
                sum = nums[start]+nums[end]+nums[i];
            }
            
            if(start != end && sum == target)
                return target; 
           
        }
        
        return ans;
    }
}
