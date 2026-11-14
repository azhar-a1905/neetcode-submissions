class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        // Binary search logic goes here
        int left=1;
        int right=0;
        for(int pile: piles){
            right= Math.max(right,pile);
        }
        while(left<right){
        int mid= left+(right-left)/2;

            if(canFinish(piles,mid,h)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
    return left;
        
    }

    private boolean canFinish(int[] piles, int k, int h) {

        long totalHours = 0;

        for (int pile : piles) {

            totalHours+=(pile+(long)k-1)/k;
        if(totalHours>h){
            return false;
        }
        }

        return true;
    }
}