class Solution
{
    public static void sort012(int a[], int n)
    {
        int sum = 0;
    int count = 0;
    for(int num : a){
        if(num == 0) count++;
        sum = sum + num;
    }
    
    int ones = 2*a.length - 2*count - sum ;
    for(int i = 0;i<a.length;i++){
        if(i <= count)
            a[i] = 0;
        else if(count < i && i <= count + ones)
            a[i] = 1;
        else
            a[i] = 2;
    }
    
    }
}
