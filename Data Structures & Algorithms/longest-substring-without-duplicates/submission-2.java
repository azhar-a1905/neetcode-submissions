class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
         HashMap <Character,Integer>hs=new HashMap<>();
       int left= 0;
       int right=0;
       while(right<s.length()){
        if(!hs.containsKey(s.charAt(right))){
            int currentLength= 1+right-left;
            if(maxLength<currentLength){
                maxLength=currentLength;
            }
                hs.put(s.charAt(right),right);
                right++;
        }
        else{
            left = Math.max(left, hs.get(s.charAt(right)) + 1);
             int currentLength= 1+right-left;
                hs.put(s.charAt(right),right);
            if(maxLength<currentLength){
                maxLength=currentLength;
        }
        right++;
       }    
    }
       return maxLength;
}}
