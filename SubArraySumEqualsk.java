class Solution {
    public int subarraySum(int[] nums, int k) {
        
          int count = 0;
        for(int i = 1;i<nums.length;i++){

            nums[i] = nums[i] + nums[i-1];
        }
        
        for(int i = 0;i<nums.length;i++){
            if(k == nums[i])
                count++;
        }
        
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] - nums[i] == k)
                    count++;
            }
        }
        
        return count;
    }
}
