class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let nums2= new Set(nums);
        if(nums.length == nums2.size){
            return false
        }
        else return true
}
}