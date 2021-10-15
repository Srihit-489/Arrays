class Solution {
    int[][] position = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    boolean[][] visited = new boolean[board.length][board[0].length];
                    if(exist(board,i,j,word,0,visited))
                        return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean exist(char[][] board,int x,int y,String word,int pos,boolean[][] visited){
        if(pos == word.length()-1)
            return true;
        visited[x][y] = true;
        for(int[] chance : position){
            int i = x + chance[0];
            int j = y + chance[1];
            if(0 <= i && i < board.length && 0 <= j && j < board[0].length && !visited[i][j] && board[i][j] == word.charAt(pos+1)){
                if(exist(board,i,j,word,pos+1,visited))
                    return true;
                else
                    visited[i][j] = false;
            }
        }
        
        return false;
        
    }
}
