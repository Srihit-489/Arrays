class Solution {
    HashSet<Integer> data = new HashSet<Integer>();
    public int arrayNesting(int[] nums) {
        int max = 0;
        for(int i = 0;i< nums.length;i++){
            int ans = set(nums,i);
            if(ans != -1)
            max = Math.max(ans,max);
        }
        return max;
    }
    
    public int set(int[] arr,int start){
        if(data.contains(start))
            return -1;
        HashSet<Integer> myhash = new HashSet<Integer>();
        int runner = start;
        while(!myhash.contains(runner)){
            data.add(runner);
            myhash.add(runner);
            runner = arr[runner];
        }
        
        return myhash.size();
    }
}
