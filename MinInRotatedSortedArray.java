class Solution {
    int min = 0;
    public int findMin(int[] nums) {
        if(nums.length == 2){
            return Math.min(nums[0],nums[1]);
        }
      min = nums[0];
      findmin(nums,nums[0],0,nums.length-1);
        return min;
    }
    
    public void findmin(int[] nums,int ref,int start,int end){
        if(start > end)
            return;
        if(end - start == 1){
            min = Math.min(nums[start],min);
            min = Math.min(nums[start+1],min);
            return;
        }
        int mid = (start+end)/2;
       // System.out.println("Comparing "+nums[mid]+" And "+ref);
        if(nums[mid] > ref){
            findmin(nums,nums[mid],mid+1,end);
        }else{
            min = Math.min(min,nums[mid]);
            findmin(nums,ref,start,mid-1);
        }
    }

}
