class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> mylist = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        for(int i : nums)
            input.add(i);
        permutate(mylist,input,new ArrayList());
        return mylist;
    }
    
    public void permutate(List<List<Integer>> mylist,List<Integer> input,List<Integer> current){
        if(input.size() == 0){
            if(!mylist.contains(current))
                mylist.add(current);
        }else{
            for(int i : input){
                int ind = input.indexOf(i);
                List<Integer> newcurrent =  new ArrayList<>(current);
                newcurrent.add(i);
                List<Integer> newinput = new ArrayList<>(input);
                newinput.remove(ind);
                permutate(mylist,newinput,newcurrent);
            }
        }
    }
}
