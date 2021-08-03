class Solution {
    public void sortColors(int[] arr) {
        HashMap<Integer,Integer> myhash = new HashMap<Integer,Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        myhash.put(0,0);
        myhash.put(1,0);
        myhash.put(2,0);
        for(int i : arr)
            myhash.put(i,myhash.get(i)+1);
        for(int i=0;i<myhash.get(0);i++){
            arr[i] = 0;
        }
        for(int i=myhash.get(0);i<myhash.get(0)+myhash.get(1);i++){
            arr[i] = 1;
        }
        for(int i=myhash.get(0)+myhash.get(1);i<arr.length;i++){
            arr[i] = 2;
        }
        return;
    }
}
