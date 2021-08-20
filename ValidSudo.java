class Solution {
    int[][] ranges = new int[][]{{0,2},{3,5},{6,8}};
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!rowcheck(board[i]))
                return false;
        }
        for(int i=0;i<9;i++){
            if(!colcheck(board,i))
                return false;
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!boxcheck(board,ranges[i],ranges[j]))
                    return false;
            }
        }
        return true;
   
    }
    
    public boolean boxcheck(char[][] board,int[] xrange,int[] yrange){
        HashSet<Character> myhash = new HashSet<Character>();
        for(int i = xrange[0];i<=xrange[1];i++){
            for(int j = yrange[0];j <= yrange[1];j++){
                if(board[i][j] != '.'){
                    if(myhash.contains(board[i][j]))
                        return false;
                    else
                        myhash.add(board[i][j]);
                }
                
            }
        }
        
        return true;
    }
    
    public boolean colcheck(char[][] board,int col){
        HashSet<Character> myhash = new HashSet<Character>();
        for(int i =0;i<9;i++){
            if(board[i][col] != '.'){
                if(myhash.contains(board[i][col]))
                    return false;
                else
                    myhash.add(board[i][col]);
            }
        }
        
        return true;
    }
    
    public boolean rowcheck(char[] arr){
        HashSet<Character> myhash = new HashSet<>();
        for(int i=0;i<9;i++){
            if(arr[i] != '.'){
                if(myhash.contains(arr[i]))
                    return false;
                else
                    myhash.add(arr[i]);
            }
                
        }
        return true;
    }
}
