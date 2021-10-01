class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return getans(matrix,matrix[0].length,0,matrix.length*matrix[0].length-1,target);
    }
    
    public boolean getans(int[][] matrix,int n,int start,int end,int target){
        if(end < start)
            return false;
        int mid = (start+end)/2;
        if(matrix[mid/n][mid%n] == target)
            return true;
        if(end - start == 1){
            if(matrix[start/n][start%n] == target)
                return true;
            else if(matrix[end/n][end%n] == target)
                return true;
            else
                return false;
        }
        if(matrix[mid/n][mid%n] > target)
            return getans(matrix,n,start,mid-1,target);
        else 
            return getans(matrix,n,mid+1,end,target);
    }
}
