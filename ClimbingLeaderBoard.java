    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
       List<Integer> sorted = new ArrayList<Integer>();
           int i = 0;
           while(i < ranked.size()){
               int cur = ranked.get(i);
               sorted.add(cur);
               while(i < ranked.size() && ranked.get(i) == cur)
                 i = i + 1;
           }
           int n = sorted.size();
           i = 0;
           List<Integer> retlist = new ArrayList<>();
          for(int score : player){
              while(i < n && sorted.get(n-i-1) <= score)
                 i = i + 1;
                 
              retlist.add(n - i + 1);
          }
          
          return retlist;
       

    }

}
