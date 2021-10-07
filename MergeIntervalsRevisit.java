class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> mylist = new ArrayList<int[]>();
        for(int[] time : intervals){
            mylist.add(new int[]{time[0],0});
            mylist.add(new int[]{time[1],1});
        }
        
        Collections.sort(mylist,new Comp());
        int start = 0;
        int count = 0;
        List<int[]> result = new ArrayList<int[]>();
        
        for(int[] time : mylist){
            if(count == 0){
                start = time[0];
                if(result.size() != 0 && start == result.get(result.size()-1)[1])
                    result.remove(result.size()-1);
            }
            if(time[1] == 0){
                count++;
            }else if(time[1] == 1){
                count--;
            }
            
            if(count == 0 && time[1] == 1){
                result.add(new int[]{start,time[0]});
            }
           
            
        }
         int[][] ret = new int[result.size()][2];
        for(int i = 0;i<result.size();i++)
             ret[i] = result.get(i);
        return ret;
    }
    
    class Comp implements Comparator<int[]>{
        public int compare(int[] a,int[] b){
            if(a[0] != b[0])
                return a[0]-b[0];
            return a[1] - b[1];
        }
    }
}
