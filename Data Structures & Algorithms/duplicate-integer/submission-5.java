class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet s = new HashSet();
        for(int i : nums){
            if(s.contains(i)){
                return true;
            }else{

            s.add(i);
            }
        }
        return false;
        

    }
}