class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int size = n-k;
        for(int i = 1;i<n;i++)
            cardPoints[i] = cardPoints[i]+cardPoints[i-1];
        sum = cardPoints[n-1];
        if(size == 0)
            return sum;
        int min = cardPoints[size-1];
        for(int i = size;i<n;i++){
            min = Math.min(min,cardPoints[i]-cardPoints[i-size]);
        }
        
        return sum - min;
        
    }
}
