class Solution {

    public void calSub(int[] nums,List<List<Integer>> ans,List<Integer> temp,int st, int target){
        if(target < 0){
            return;
        } else if(target == 0){
                ans.add(new ArrayList<>(temp));
            return ;
        } else {
            for(int i=st;i<nums.length;i++){
                if(i>st && nums[i]==nums[i-1]) continue;
                temp.add(Integer.valueOf(nums[i]));
                calSub(nums,ans,temp,i+1,target-(Integer.valueOf(nums[i])));
                temp.remove(Integer.valueOf(nums[i]));
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        calSub(candidates,ans,temp,0,target);
        return ans;
    }
}