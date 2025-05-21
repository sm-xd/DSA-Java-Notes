package Collections.grids;

public class _453_Islands_perimeter {
    // Test cases for islandPerimeter
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1: Single island
        int[][] grid1 = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        System.out.println("Test case 1: " + sol.islandPerimeter(grid1)); // Expected: 16
        
        // Test case 2: No island
        int[][] grid2 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        System.out.println("Test case 2: " + sol.islandPerimeter(grid2)); // Expected: 0
        
        // Test case 3: Full island
        int[][] grid3 = {
            {1, 1},
            {1, 1}
        };
        System.out.println("Test case 3: " + sol.islandPerimeter(grid3)); // Expected: 8
        
        // Test case 4: Single cell island
        int[][] grid4 = {{1}};
        System.out.println("Test case 4: " + sol.islandPerimeter(grid4)); // Expected: 4
    }

}

class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==1){
                    
                    if(( j==0 ) || ( j>0 && grid[i][j-1] == 0)) cnt++;

                    if(( i==0 ) || ( i>0 && grid[i-1][j] == 0)) cnt++;

                    if(( j==m-1 ) || ( j<m-1 && grid[i][j+1] == 0)) cnt++;

                    if(( i==n-1 ) || ( i<n-1 && grid[i+1][j] == 0 )) cnt++;
                }
            }
        }
        return cnt;
    }
}