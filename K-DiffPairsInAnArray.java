class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0 || nums.length < 2)
            return 0;
        Map<Integer,Integer> myhash = new HashMap<Integer,Integer>();
        int count = 0;
        for(int num : nums)
            myhash.put(num,myhash.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry : myhash.entrySet()){
            if(k == 0){
                if(entry.getValue() > 1)
                    count++;
            }else{
                if(myhash.containsKey(entry.getKey()+k))
                    count++;
            }
        }
        return count;
    }
}
