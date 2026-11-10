class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int candidate= (left+right)/2;
        
            if(nums[candidate]==target){
                return candidate;
            }
            else if(nums[candidate]<target){
                left=candidate+1;
            }
            else if(nums[candidate]>target){
                right=candidate-1;
            }
        }
    return -1;
    }
}
