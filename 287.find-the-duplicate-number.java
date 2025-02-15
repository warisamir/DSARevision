/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        do {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(fast!=slow);
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
// @lc code=end

