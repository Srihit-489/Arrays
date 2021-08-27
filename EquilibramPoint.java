class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        if(arr.length == 1){
            return 1;
        }
        long[] sum = new long[arr.length];
        sum[0] = arr[0];
        for(int i = 1;i < arr.length;i++){
            sum[i] = sum[i-1] + arr[i];
        }
        
        for(int i=1;i<arr.length;i++){
            if(sum[i-1] == sum[arr.length-1] - sum[i]){
                return i+1;
            }
        }
        return -1;
    }
}
