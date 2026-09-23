class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Set <Integer> s= new HashSet();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int count;
        // int current;
        int max=0;
      for(int num:nums){
        if(!s.contains(num-1)){
            count =1;
           int current=num;
        while(s.contains(current+1)){
            count++;
            current=current+1;

        }
        if(max<count){ max=count;}
        }
      }
      return max;
       }
    }
