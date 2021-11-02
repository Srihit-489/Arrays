class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        return (int)((getMaxCut(h,horizontalCuts) * getMaxCut(w,verticalCuts))%((long)(Math.pow(10,9)+7)));
    }
    
    public  long getMaxCut(int limit,int[] arr){
        Arrays.sort(arr);
        long start = 0;
        long max = 0;
        for(int k : arr){
            long num = (long)k;
            max = Math.max(max,num - start);
            start = num;
        }
        
        max = Math.max(max,limit - arr[arr.length-1]);
        
        return max;
    }
}
