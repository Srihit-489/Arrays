  public static int getmin(List<List<Integer>> mylist , int[] arr){
         int count = 0;
         for(int i =0;i<3;i++){
             for(int j=0;j<3;j++){
                 count+= Math.abs(mylist.get(i).get(j) - arr[3*i + j]);
             }
         }
         return count;
     }

    public static int formingMagicSquare(List<List<Integer>> s) {
       int[][] all = new int[][]{{8, 1, 6, 3, 5, 7, 4, 9, 2}, {6, 1, 8, 7, 5, 3, 2, 9, 4},
            {4, 3, 8, 9, 5, 1, 2, 7, 6}, {2, 7, 6, 9, 5, 1, 4, 3, 8},
            {2, 9, 4, 7, 5, 3, 6, 1, 8}, {4, 9, 2, 3, 5, 7, 8, 1, 6},
            {6, 7, 2, 1, 5, 9, 8, 3, 4}, {8, 3, 4, 1, 5, 9, 6, 7, 2}};
            int min = Integer.MAX_VALUE;
        for(int i=0;i<8;i++){
            min = Math.min(min,getmin(s,all[i]));
        }
        
        return min;

    }
