class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<String> myhash = new HashSet<String>();
        HashSet<Integer> mynums = new HashSet<Integer>();
        for(int num : nums)
            mynums.add(num);
        for(int num : nums){
            if(mynums.contains(num+k)){
                int[] pair = new int[]{num,num+k};
                Arrays.sort(pair);
                String str = ""+pair[0]+pair[1];
                myhash.add(str);
            }else if(mynums.contains(num-k)){
                int[] pair = new int[]{num,num-k};
                Arrays.sort(pair);
                String str = ""+pair[0]+pair[1];
                myhash.add(str);
            }
        }
        
        return myhash.size();
    }
}
