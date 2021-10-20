class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>  mylist = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        getans(candidates,mylist,new ArrayList<Integer>(),target,0);
        return mylist;
    }
    
    public void getans(int[] arr,List<List<Integer>> mylist,List<Integer> current,int target,int start){
        if(target == 0){
            if(!mylist.contains(current))
               mylist.add(new ArrayList(current));
            return;
        }else if(target < 0){
            return;
        }else{
            for(int i = start;i<arr.length;i++){
                int num = arr[i];
                current.add(num);
                target-=num;
                getans(arr,mylist,current,target,i);
                target+=num;
                current.remove(current.size()-1);
            }
        }
    }
}
