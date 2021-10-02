class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)
            return 0;
        if(prices.length == 2){
            int max = Math.max(prices[1]-prices[0],0);
            return max;
        }
        int n = prices.length;
        int[] arr = new int[n];
        arr[n-1] = -999999999;
        arr[n-2] = prices[n-1];
        for(int i = n-3;i>=0;i--)
            arr[i] = Math.max(arr[i+1],prices[i+1]);
        int max = 0;
        for(int i = 0;i<prices.length;i++)
            max = Math.max(max,arr[i]-prices[i]);
        return max;
    }
}
