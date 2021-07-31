class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> mylist = new ArrayList<>();
        getlist(mylist,new ArrayList<>(),candidates,target,0);
        return mylist;
    }
    
    public static void getlist(List<List<Integer>> mylist,List<Integer> curr,int[] arr,int tar,int start){
        if(tar <= 0){
            if(!mylist.contains(curr) && tar == 0){
                mylist.add(new ArrayList(curr));
            }
            return;
        }else{
            HashSet<Integer> myhash = new HashSet<Integer>();
            for(int i=start;i<arr.length;i++){
                if(arr[i] <= tar && !myhash.contains(arr[i])){
                    curr.add(arr[i]);
                    getlist(mylist,curr,arr,tar-arr[i],i+1);
                    curr.remove(curr.size()-1);
                    myhash.add(arr[i]);
                }
            }
        }
        
    }
    
    
    
}
