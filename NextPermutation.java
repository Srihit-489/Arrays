class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1])
            i--;
        if(i < 0){
            Arrays.sort(nums);
            return;
        }
        int j = n-1;
        while(nums[j] <= nums[i])
            j--;
       // System.out.println(i+" "+j);
        swap(nums,i,j);
        reverse(nums,i+1,n-1);
    }
    
    public void reverse(int[] nums,int start,int end){
        while(start <= end){
            swap(nums,start,end);
            start++;
            end--;
        }
        return;
    }
    
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
