class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for(int i = 0;i< nums.length;i++){
            max = Math.max(set(nums,i),max);
        }
        return max;
    }
    
    public int set(int[] arr,int start){
        HashSet<Integer> myhash = new HashSet<Integer>();
        int runner = start;
        while(!myhash.contains(runner)){
            myhash.add(runner);
            runner = arr[runner];
        }
        
        return myhash.size();
    }
}

