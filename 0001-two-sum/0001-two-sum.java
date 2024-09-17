class Solution {
    public int[] twoSum(int[] nums, int target) { 
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int firstelmnt=nums[i];
        int moreneeded=target-firstelmnt;
        if(map.containsKey(moreneeded)){
         return new int[]{map.get(moreneeded),i};
        }
        map.put(nums[i],i);
    }
        return new int[] {};
    }
   
}