class Solution {
    public void moveZeroes(int[] nums) {
        //int runner1 = 0;
        //int runner2 = nums.length-1;
        int nz = 0;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[nz] = nums[i];
                nz++;
            }
        }
        
        for(int i = nz;i<nums.length;i++)
            nums[i] = 0;
        return;
            
    }
}
