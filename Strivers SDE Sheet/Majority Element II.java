class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int mx=0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            } else {
                mp.put(nums[i],1);
            }
            if(!ans.contains(nums[i]) && mp.get(nums[i])>(nums.length/3)){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}