class Solution {
    
    int[][] pos = new int[][]{{0,2},{3,5},{6,8}};
    
    public void solveSudoku(char[][] board) {
       makeboard(board,0,0);
    }
    
    public boolean makeboard(char[][] board,int istart,int jstart){
        for(int i= istart;i<9;i++){
            for(int j = jstart;j<9;j++){
                if(board[i][j] == '.'){
                    if(!assign(board,i,j)){
                        // board[i][j] = '.';
                        return false;
                        
                    }
                        
                }
                    
            }
        }
        
        return true;
    }
    
    public boolean assign(char[][] board,int x,int y){
        boolean[] exist = new boolean[10];
        for(int i=0;i<9;i++){
            if(board[x][i] != '.')
                exist[board[x][i] - '0'] = true;
            if(board[i][y] != '.')
                exist[board[i][y] - '0'] = true;
        }
        
        int[] xcoord = new int[2];
        int[] ycoord = new int[2];
        for(int i=0;i<3;i++){
            if(pos[i][0] <= x && x <= pos[i][1]){
                xcoord = pos[i];
            }
            
             if(pos[i][0] <= y && y <= pos[i][1]){
                ycoord = pos[i];
            }
            
        }
        
        for(int i=xcoord[0];i<=xcoord[1];i++){
            for(int j = ycoord[0];j<= ycoord[1];j++){
                if(board[i][j] != '.')
                    exist[board[i][j] - '0'] = true;
            }
        }
        
        for(int i = 1;i<=9;i++){
            if(!exist[i]){
                board[x][y] = (char)(i + '0');
                if(makeboard(board,0,0))
                    return true;
                else
                    board[x][y] = '.';
            }
        }
        
     //   board[x][y] = '.';
        
        return false;
 
    }
}
