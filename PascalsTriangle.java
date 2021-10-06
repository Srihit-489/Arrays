class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> one = new ArrayList<Integer>();
        one.add(1);
        result.add(one);
        for(int i = 1;i<n;i++){
            List<Integer> mylist = new ArrayList<Integer>();
            mylist.add(1);
            List<Integer> current = result.get(i-1);
            for(int j = 0;j<current.size()-1;j++){
                mylist.add(current.get(j)+current.get(j+1));
            }
            mylist.add(1);
            result.add(mylist);
        }
        
        return result;
    }
}
