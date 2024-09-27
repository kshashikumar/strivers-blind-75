class Solution {
    public void allSubs(int[] nums, List<List<Integer>> ans,List<Integer> temp,int st){
        if(!ans.contains(new ArrayList<>(temp))){
             ans.add(new ArrayList<>(temp));
        }
       
        for(int i=st;i<nums.length;i++){
            temp.add(Integer.valueOf(nums[i]));
            allSubs(nums,ans,temp,i+1);
            temp.remove(Integer.valueOf(nums[i]));
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
       Arrays.sort(nums);
        allSubs(nums,ans,temp,0);
        return ans;
    }
}