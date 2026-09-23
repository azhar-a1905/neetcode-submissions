class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let hashmap={}
        for(let i =0; i<nums.length;i++){
            hashmap[nums[i]]=(hashmap[nums[i]] || 0) + 1
        }
        let sortedKeys = Object.keys(hashmap)
        .sort((a, b) => hashmap[b] - hashmap[a]);

    return sortedKeys.slice(0, k).map(Number);
    }
}
