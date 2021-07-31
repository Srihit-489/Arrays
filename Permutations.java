class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> mylist = new ArrayList<>();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i: nums){
            arr.add(i);
        }
        getlist(arr,mylist,new ArrayList<>(),arr.size());
        return mylist;
    }
    
    public void getlist(List<Integer> arr,List<List<Integer>> mylist,List<Integer> cur,int n){
        if(cur.size() == n){
            mylist.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<arr.size();i++){
            int num = arr.get(i);
            cur.add(num);
            arr.remove(i);
            getlist(arr,mylist,cur,n);
            cur.remove(cur.size()-1);
            arr.add(i,num);
        }
    }
}
