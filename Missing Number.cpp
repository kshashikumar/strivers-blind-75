class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int s = 0;
        int f = (nums.size()*(nums.size()+1))/2;
        for(int i=0;i<nums.size();i++){
            s+=nums[i];
        }
        return abs(s-f);
    }
};