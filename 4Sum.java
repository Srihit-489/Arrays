class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> mylist = new ArrayList<List<Integer>>();
        if(nums.length < 4)
            return mylist;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int start = j+1;
                int end = n-1;
                 while(start < end){
                int sum = nums[i] + nums[j] + nums[start]+ nums[end];
                if(sum == target){
                    List<Integer> l = new ArrayList<Integer>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[start]);
                    l.add(nums[end]);
                    if(!mylist.contains(l))
                        mylist.add(l);
                    int leftval = nums[start];
                    while(start < n && nums[start] == leftval)
                        start++;
                    int rightval = nums[end];
                    while(end > start && nums[end] == rightval)
                        end--;
                    
                }else if(sum < target)
                    start++;
                else
                    end--;
                 }
            }
        }
        return mylist;
    }
}
