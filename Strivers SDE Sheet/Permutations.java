class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }
    public void allPerm(int idx,int[] nums, List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }

        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            allPerm(idx+1,nums,ans);
            swap(nums,idx,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        allPerm(0,nums,ans);
        return ans;
    }
}