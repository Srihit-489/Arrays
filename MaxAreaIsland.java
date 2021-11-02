class Solution {
    int[][] pos = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    max = Math.max(max,getarea(i,j,grid));
                }
            }
        }
        return max;
    }
    
    public int getarea(int x,int y,int[][] arr){
        int count = 1;
        arr[x][y] = 0;
        for(int[] a : pos){
            if(check(x+a[0],y+a[1],arr) && arr[x+a[0]][y+a[1]] == 1)
                count += getarea(x+a[0],y+a[1],arr);
        }
        
        return count;
    }
    
    public boolean check(int x,int y,int[][] arr){
        return x >= 0 && y >= 0 && x < arr.length && y < arr[0].length;
    }
}
