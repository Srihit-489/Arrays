class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        // for(int i = 0;i<n;i++)
        //     nums[i]--;
        int current = 0;
        while(current == nums[current]){
            current++;
        }
        
        while(current != nums[current]){
            int temp = nums[current];
            nums[current] = current;
            current = temp;
        }
        
    
        return current;
    }
}
