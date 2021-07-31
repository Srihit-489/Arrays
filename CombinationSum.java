class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> mylist = new ArrayList<>();
        Arrays.sort(candidates);
        getlist(mylist,new ArrayList<>(),candidates,target,0);
        return mylist;
    }
    public void getlist(List<List<Integer>> mylist,List<Integer> curr,int[] arr,int tar,int start){
        if(tar == 0){
            mylist.add(new ArrayList<>(curr));
            return;
        }else if(tar < 0){
            return;
        }else{
            for(int i = start;i<arr.length;i++){
                
                if(arr[i] <= tar){
                    curr.add(arr[i]);
                    getlist(mylist,curr,arr,tar-arr[i],i);
                    curr.remove(curr.size()-1);
                }
                
            }
        }
    }
    
    
    
}
