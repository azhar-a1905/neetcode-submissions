class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let complement=0;
        let nums2=[];
        for(let i=0;i<nums.length;i++){
            complement = target-nums[i];
            if(nums2.includes(complement)){
                return [i,nums.indexOf(complement)];

            }
            nums2.push(nums[i])
        }
    }
}
