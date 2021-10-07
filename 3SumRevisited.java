class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> mylist = new ArrayList<List<Integer>>();
        if(nums.length < 3)
            return mylist;
        for(int i = 0;i<nums.length-2;i++){
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    List<Integer> current = new ArrayList<Integer>();
                    current.add(nums[i]);
                    current.add(nums[low]);
                    current.add(nums[high]);
                    Collections.sort(current);
                    if(!mylist.contains(current))
                        mylist.add(current);
                    low++;
                    high--;
                }else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return mylist;
    }
}
