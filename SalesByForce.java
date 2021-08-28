public static int sockMerchant(int n, List<Integer> ar) {
       HashSet<Integer> myhash = new HashSet<Integer>();
       for(int a : ar){
           if(myhash.contains(a))
                myhash.remove(a);
            else
                myhash.add(a);
       }
       return (ar.size()-myhash.size())/2;

    }
