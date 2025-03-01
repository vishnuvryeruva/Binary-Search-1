// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//Time Complexity: O(1)
//Space Complexity: O(1)

// Your code here along with comments explaining your approach


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0)
        int m = matrix.length;
        int n = matrix[0].length;
        while(low <= high){
          int mid = low +(high -low)/2;
          int r = mid/n;
          int c = mid%n;
          if(matrix[r][c] == target)
            return true;
          else if(matrix[r][c] > target)
            high = mid - 1;
          else
            low = mid + 1;;
        }
          return false;

    }
}
