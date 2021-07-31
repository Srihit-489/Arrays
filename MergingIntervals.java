class Solution {
    public int[][] merge(int[][] intervals) {
     //   int[] data = new int[intervals.length*2];
        int i=0;
        List<int[]> mylist = new ArrayList<>();
        for(i=0;i<intervals.length;i++){
            mylist.add(intervals[i]);
        }
        Collections.sort(mylist,new Comp());
        i = 0;
        
            while(i < mylist.size()-1){
                if(mylist.get(i)[1] >= mylist.get(i+1)[0] && mylist.get(i)[0] <= mylist.get(i+1)[0]){
                    int start = mylist.get(i)[0];
                    int end = Math.max(mylist.get(i+1)[1],mylist.get(i)[1]);
                    mylist.remove(i);
                    mylist.remove(i);
                    int[] newpair = new int[]{start,end};
                    mylist.add(i,newpair);
                    i--;
                }
                i++;
            }
        int[][]  data = new int[mylist.size()][2];
        for(int j=0;j<mylist.size();j++){
            data[j][0] = mylist.get(j)[0];
            data[j][1] = mylist.get(j)[1];
        }
        return data;
        
    }
    
    class Comp implements Comparator<int[]>{
        public int compare(int[] o1,int[] o2){
            if(o1[0] != o2[0]){
                return o1[0] - o2[0];
            }else{
                return o1[1] - o2[1];
            }
        }
    }
}
