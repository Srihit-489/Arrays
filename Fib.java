class Solution {
    public int fib(int n) {
        if(n < 3){
            if(n == 0)
                return 0;
            else if(n == 1)
                 return 1;
            else
                 return 1;
        }
        int[] data = new int[n+1];
        data[0] = 0;
        data[1] = 1;
        data[2] = 1;
        return getans(data,n);
    }
    
    public int getans(int[] data,int n){
        if(n  == 0 || data[n] != 0)
            return data[n];
        else{
            data[n] = getans(data,n-1)+getans(data,n-2);
            return data[n];
        }
    }
}
