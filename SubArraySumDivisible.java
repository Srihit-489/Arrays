class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        if(nums.length == 0)
            return 0;
        HashMap<Integer,Integer> myhash = new HashMap<Integer,Integer>();
        myhash.put(0,1);
        int sum = 0,count = 0;
        for(int num : nums){
            sum = (sum + num)%k;
            if(sum < 0)
                sum += k;
            count += myhash.getOrDefault(sum,0);
            myhash.put(sum,myhash.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
