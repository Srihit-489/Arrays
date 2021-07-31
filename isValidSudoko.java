class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet[] myhashcol = new HashSet[9];
        HashSet[] myhashrow = new HashSet[9];
        HashSet[][] box = new HashSet[3][3];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(myhashcol[j] == null)
                    myhashcol[j] = new HashSet<>();
                if(myhashrow[i] == null)
                    myhashrow[i] = new HashSet<>();
                if(box[i/3][j/3] == null)
                    box[i/3][j/3] = new HashSet<>();
                if(ch != '.'){
                    if(myhashrow[i].contains(ch) || myhashcol[j].contains(ch) || box[i/3][j/3].contains(ch)){
                        return false;
                    }
                    if(ch != '.'){
                        myhashrow[i].add(ch);
                        myhashcol[j].add(ch);
                        box[i/3][j/3].add(ch);
                    }
                }
            }
        }
        return true;
    }
}
