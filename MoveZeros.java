class Solution {
    public void moveZeroes(int[] nums) {
        //int runner1 = 0;
        //int runner2 = nums.length-1;
        List<Integer> mylist = new ArrayList<Integer>();
        for(int num : nums){
            if(num != 0)
                mylist.add(num);
        }
        for(int i = 0;i<nums.length;i++){
            if(i <= mylist.size()-1)
                nums[i] = mylist.get(i);
            else
                nums[i] = 0;
        }
        return;
            
    }
}
