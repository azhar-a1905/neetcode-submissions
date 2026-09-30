class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length()){
        return false;
       } 
       HashMap <Character, Integer> s1Map= new HashMap<>();
       for(int i=0;i<s1.length();i++){
        s1Map.put(s1.charAt(i),s1Map.getOrDefault(s1.charAt(i),0)+1);
       }
       int left=0;
       HashMap <Character, Integer> windowMap = new HashMap<>();
       for(int right=0;right<s2.length();right++){
        Character current=s2.charAt(right); 
        windowMap.put(current,windowMap.getOrDefault(current,0)+1);

        int currentWindowSize= right-left+1;
        Character leftChar= s2.charAt(left);
        if(currentWindowSize>s1.length()){
        windowMap.put(leftChar,windowMap.getOrDefault(leftChar,0)-1);
        left++;
        }
        if(windowMap.get(leftChar)==0){
            windowMap.remove(leftChar);
        }
        
       if(windowMap.equals(s1Map)){
        return true;
       }
       }
       return false;
    }
}
