class Solution {
    public int numPairsDivisibleBy60(int[] time) {
       int[] nums = new int[60];
        for(int num : time){
            int pos = num%60;
            nums[pos]++;
        }
        
        int count = 0;
        for(int i = 1;i<30;i++){
            count = count+nums[i]*nums[60-i];
        }
        
        count = count + (nums[30]*(nums[30]-1))/2;
        count = count + (nums[0]*(nums[0]-1))/2;
        return count;
    }
}
