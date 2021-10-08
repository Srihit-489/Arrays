 class RandomizedSet {
    List<Integer> mylist;
    public RandomizedSet() {
        mylist = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        for(int i = 0;i<mylist.size();i++){
            if(mylist.get(i) == val)
                return false;
        }
        
        mylist.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        for(int i = 0;i<mylist.size();i++){
            if(mylist.get(i) == val){
                mylist.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int getRandom() {
        double size = (double)mylist.size();
        int num = (int)(Math.random()*size);
        return mylist.get(num);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
