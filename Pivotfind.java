// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//Time Complexity: O(log n)
//Space Complexity: O(1)

// Your code here along with comments explaining your approach

class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
          return -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
          int mid = low + (high-low)/2;
          if(nums[low] <= nums[mid]){
            if(nums[low] <= target && nums[mid < target])
              high = mid - 1;
            else
              low = mid + 1;
          }
          else {
            if(nums[mid] < target && nums[high] >= target){
              low = mid + 1;
            }
            else {
              high = mid - 1;
            }
          }
        }
        return -1;
    }
}
