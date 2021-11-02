class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int status = 0;
        List<Integer> retvalues = new ArrayList<Integer>();
        int i = 0;
        while(i < nums.length){
            status = 0;
            while(i < nums.length && nums[i] == i+1)
                i++;
            if(i == nums.length)
                return retvalues;
            int start = nums[i];
            nums[i] = 0;
            while(nums[start-1] != start){
                if(nums[start-1] == 0){
                    nums[start-1] = start;
                    status = 1;
                    break;
                }
                int temp = nums[start-1];
                nums[start-1] = start;
                start = temp;   
            }
            if(status == 0)
                retvalues.add(start);
            
            i++;
       
        }
        
        return retvalues;
    }
}
