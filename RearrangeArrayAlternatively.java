class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[], int n){
        
        int runner1 = 0;
        int runner2 = arr.length-1;
        int[] retarray = new int[n];
        int count = 0;
        while(runner2 >= runner1){
            if(count%2 == 0){
                retarray[count] = arr[runner2];
                count++;
                runner2--;
            }else{
                retarray[count] = arr[runner1];
                count++;
                runner1++;
            }
        }
        for(int i = 0;i<a.length;i++){
            arr[i] = retarray[i];
        }
        
    }
    
}
