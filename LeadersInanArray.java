class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        leaders.add(arr[n-1]);
        int cur = arr[n-1];
        for(int i = n-2;i>=0 ; i--){
            if(cur <= arr[i]){
                leaders.add(arr[i]);
                cur = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
