class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int start = n;
        for(int i = 0;i<n;i++){
            if(nums[i] > 0){
                start = i;
                break;
            }    
        }
        int[] arr = new int[n];
        int runner1 = start-1;
        int runner2 = start;
        for(int i = 0;i<n;i++){
            if(runner1 >= 0 && runner2 < n && Math.abs(nums[runner1]) < nums[runner2]){
                arr[i] = nums[runner1]*nums[runner1];
                runner1--;
            }else if(runner2 < n){
                arr[i] = nums[runner2]*nums[runner2];
                runner2++;
            }else{
                if(runner1 == -1){
                    arr[i] = nums[runner2]*nums[runner2]; 
                    runner2++;
                }
                
                if(runner2 == n){
                    arr[i] = nums[runner1]*nums[runner1];
                    runner1--;
                }
                    
            }
        }
        
        return arr;
    }
}
