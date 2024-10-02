class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m1=0,si=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(si < 0){
                    si=i;
                }
                if(((i+1)-si)>m1){
                    System.out.println(i);
                    m1 = (i+1) - si;
                }
            } else {
                si=-1;
            }
        }
        return m1;
    }
}