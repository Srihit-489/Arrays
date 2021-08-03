class Solution {
    public int[] searchRange(int[] arr, int target) {
        int pos = Arrays.binarySearch(arr,target);
        if(pos < 0){
            return new int[]{-1,-1};
        }
        int start = pos;
        int end = pos;
        for(int i = start+1;i<arr.length;i++){
            if(arr[i] != target)
                break;
            end = i;
        }
        
        int begin = pos;
        for(int i=start;i>=0;i--){
            if(arr[i] != arr[start])
                break;
            begin = i;
        }
        
        return new int[]{begin,end};
    }
}
