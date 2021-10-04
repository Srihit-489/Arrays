class Solution {
    public int maxProfit(int[] arr) {
        int low = arr[0];
        int high = arr[0];
        int n = arr.length;
        int runner = 0;
        int profit = 0;
        while(runner < n-1){
            while(runner < n-1 && arr[runner] >= arr[runner+1])
                runner++;
            low = arr[runner];
            while(runner < n-1 && arr[runner] <= arr[runner+1])
                runner++;
            high = arr[runner];
            
            profit += high - low;
        }
        
        return profit;
    }
}
