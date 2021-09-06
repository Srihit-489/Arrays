 public static int nonDivisibleSubset(int k, List<Integer> s) {
      HashMap<Integer,Integer> myhash = new HashMap<Integer,Integer>();
      //HashSet<Integer> result = new  HashSet<Integer>();
      for(int num : s){
            int val = num%k;
            myhash.put(val,myhash.getOrDefault(val,0)+1); 
      }
      
      int count = 0;
      if(k%2 == 1){
          for(int i = 1;i<=k/2;i++){
          int max = Math.max(myhash.getOrDefault(i,0),myhash.getOrDefault(k-i,0));
          count = count + max;
          }
          count+= myhash.containsKey(0)? 1 : 0;
      }else{
          for(int i = 1;i<k/2;i++){
              int max = Math.max(myhash.getOrDefault(i,0),myhash.getOrDefault(k-i,0));
              count = count + max;
          }
           count+= myhash.containsKey(0)? 1 : 0;
           count+= myhash.containsKey(k/2)? 1 : 0;
      }
      
      
      
      return count;

    }
