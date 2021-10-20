class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int max = 0;
        int currentfar = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(max < i+nums[i]){
                max = i+nums[i];
            }
            
            if(currentfar == i){
                count++;
                currentfar = max;
            }
        }
        
        return count;
    }
}
