class Solution {
    public int characterReplacement(String s, int k) {
  /*      1. Need a sliding window
2. Need left and right
3. Need frequency of each character
4. Need max frequency inside the window
5. replacements = window length - maxFrequency
6. If replacements > k → move left
7. Track maximum valid window */
        int maxFreq=0;
        int maxLength=0;
        int left=0;

        HashMap <Character, Integer> hs= new HashMap<>();
        for(int right=0;right<s.length();right++){
            Character current= s.charAt(right);
            hs.put(current,hs.getOrDefault(current,0)+1);

            // if(maxFreq<hs.get(current)){
            //     maxFreq=hs.get(current);
            // }
            maxFreq=Math.max(maxFreq,hs.get(current));
            int currentWindow= right-left+1;
            if(currentWindow-maxFreq<=k){
                maxLength= Math.max(maxLength,currentWindow);
            }else{
                hs.put(s.charAt(left),hs.getOrDefault(s.charAt(left),0)-1);
                left++;
                
            }
        }
        return maxLength;




    }
}
