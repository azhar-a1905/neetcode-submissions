class Solution {
    public int maxArea(int[] heights) {
        HashMap <Integer,Integer> hs= new HashMap<>();
        int max=0;
        int right=heights.length-1;
        int left=0;

        while(left<right){
            int water=(right-left)*(Math.min(heights[left],heights[right]));
            System.out.println(water);
            if(max<water){
                max=water;
            }
            if(heights[right]<heights[left]){
                right--;
            }
            else{
                left++;
            }
        }
    return max;
    }
}
