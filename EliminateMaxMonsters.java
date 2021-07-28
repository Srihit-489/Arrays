class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for(int i=0;i<dist.length;i++){
            pq.add(dist[i] * 1.0 /speed[i]);
        }
        
        double min = 0.0;
        int count = 0;
        while(pq.size() > 0 && min < pq.peek()){
            pq.remove();
            count++;
            min = min+ 1;
        }
        return count;
    }
}
