class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> mylist = new ArrayList<Integer>();
         return getans(matrix,0,matrix.length-1,0,matrix[0].length-1,mylist);
    }
    
    public List<Integer> getans(int[][] arr,int startrow,int row,int startcol,int col,List<Integer> mylist){
        if(startrow > row || startcol > col)
            return mylist;
        for(int i = startcol;i<=col;i++)
            mylist.add(arr[startrow][i]);
        startrow++;
        
        for(int i = startrow;i<=row;i++)
            mylist.add(arr[i][col]);
        col--;
        
      
        if(startrow <= row){
            for(int i = col;i>=startcol;i--)
            mylist.add(arr[row][i]);
        }
        row--;
        
      
      
         if(startcol <= col){
              for(int i = row;i>=startrow;i--)
            mylist.add(arr[i][startcol]);
         }
         startcol++;
      
       
       
        // startrow++;
        // row--;
        // startcol++;
        // col--;
        return getans(arr,startrow,row,startcol,col,mylist);

    }
}
