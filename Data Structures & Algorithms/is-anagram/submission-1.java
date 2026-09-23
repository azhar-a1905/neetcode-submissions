class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> freqMap = new HashMap<>();
        for(int i = 0 ; i < s.length();i++){
            freqMap.put(s.charAt(i),freqMap.getOrDefault(s.charAt(i),0)+1);
            freqMap.put(t.charAt(i),freqMap.getOrDefault(t.charAt(i),0) - 1);
        }

        for(Map.Entry<Character,Integer> set : freqMap.entrySet()){
            if(set.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
