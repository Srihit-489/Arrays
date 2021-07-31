class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> myhash = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            myhash.add(nums[i]);
        }
        for(int i=1;i<= nums.length;i++){
            if(!myhash.contains(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}


// The task is it should be done in O(n)
