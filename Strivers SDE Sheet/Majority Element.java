class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int mx=0;
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            } else {
                mp.put(nums[i],1);
            }
            if(mp.get(nums[i]) > (nums.length/2)){
                mx = nums[i];
            }
        }
        return mx;
    }
}