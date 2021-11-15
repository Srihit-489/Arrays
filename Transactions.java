class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<Transaction> mylist = new ArrayList<Transaction>();
        for(String str : transactions){
            String[] details = str.split(",");
            Transaction t = new Transaction(details[0],Integer.parseInt(details[1]),Integer.parseInt(details[2]),details[3]);
            mylist.add(t);
        }
        Collections.sort(mylist,new Comp());
        List<String> ret = new ArrayList<String>();
       
        
        for(int i = 0;i<mylist.size();i++){
            Transaction t = mylist.get(i);
            if(t.amount > 1000)
                t.prob = true;
            for(int j = i+1;j<mylist.size();j++){
                Transaction n = mylist.get(j);
                if(t.name.equals(n.name) && t.time - n.time <= 60 && !t.city.equals(n.city)){
                    t.prob = true;
                    n.prob = true;
                }
            }
        }
        
        for(Transaction ts : mylist){
            if(ts.prob)
                ret.add(getobject(ts));
        }
        
        
        return ret;
           
    }
    
    class Comp implements Comparator<Transaction>{
        public int compare(Transaction t1,Transaction t2){
            if(t1.name.equals(t2.name)){
                return t2.time - t1.time;
            }else{
                return t1.name.compareTo(t2.name);
            }
        }
    }
    
    public String getobject(Transaction t){
        return t.name+","+t.time+","+t.amount+","+t.city;
    }
    
    class Transaction{
        public String name;
        public int time;
        public int amount;
        public String city;
        public boolean prob;
        
        public Transaction(String name,int time,int amount,String city){
            this.name = name;
            this.time = time;
            this.amount = amount;
            this.city = city;
            this.prob = false;
        }
    }
}
