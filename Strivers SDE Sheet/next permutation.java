import java.util.*;
class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j]=t;
    }
    public void reverse(int[] nums,int st){
        int ed = nums.length-1;
        while(st<ed){
            swap(nums,st,ed);
            st++;
            ed--;
        }
        
    }
    public void nextPerm(int[] nums){
        int i=nums.length-2;
       while(i>=0 && nums[i]>=nums[i+1]){
        i--;
       }
       if(i>=0){
        int j = nums.length-1;
        while(nums[j]<=nums[i]){
            j--;
        }
        swap(nums,i,j);
       }
       reverse(nums,i+1);
    }
    public void nextPermutation(int[] nums) {
        nextPerm(nums);
        //for(int i=0;i<v.get(1))
    }
}