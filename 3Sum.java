class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> myhash = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> reversehash = new HashMap<Integer,Integer>(); 
        for(int i=0;i<nums.length;i++){
            myhash.put(i,nums[i]);
            reversehash.put(nums[i],i);
        }
        List<List<Integer>> mylist = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(myhash.containsValue(-(nums[i]+nums[j])) && reversehash.get(-(nums[i]+nums[j])) > j){
                    List<Integer> newlist = new ArrayList<>();
                    newlist.add(nums[i]);
                    newlist.add(nums[j]);
                    newlist.add(-(nums[i]+nums[j]));
                    Collections.sort(newlist);
                    if(!mylist.contains(newlist))
                        mylist.add(newlist);
                }
                    
            }
        }
        return mylist;
    }
}

///// 315/318
