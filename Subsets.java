class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> mylist = new ArrayList<List<Integer>>();
      getsub(nums,new ArrayList<Integer>(),mylist,0);
        return mylist;
    }
    
    public void getsub(int[] nums,List<Integer> current,List<List<Integer>> mylist,int start){
        if(start == nums.length){
              mylist.add(current);  
              return;
        }
        List<Integer> newlist = new ArrayList<Integer>(current);
        newlist.add(nums[start]);
        getsub(nums,current,mylist,start+1);
        getsub(nums,newlist,mylist,start+1);
    }
}
