class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashSet<List<Integer>> myhash = new HashSet<List<Integer>>();
       if(nums.length == 0){
           return new ArrayList<>();
       }
        
       Arrays.sort(nums); 
       for(int i=0;i<nums.length-2;i++){
           int j = i+1;
           int k = nums.length-1;
           while(j<k){
               int sum = nums[i]+nums[j]+nums[k];
               if(sum == 0){
                   List<Integer> newlist = new ArrayList<>();
                   newlist.add(nums[i]);
                   newlist.add(nums[j]);
                   newlist.add(nums[k]);
                   j++;
                   k--;
                   myhash.add(newlist);
               }else if( sum > 0)
                   k--;
               else
                   j++;
                   
           }
       } 
        
       return new ArrayList(myhash);
        
    }
}
