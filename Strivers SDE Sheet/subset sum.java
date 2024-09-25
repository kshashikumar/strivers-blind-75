// User function Template for Java//User function Template for Java
class Solution {
    public void getSubs(ArrayList<Integer> arr,ArrayList<Integer> ans,ArrayList<Integer> temp,int st, int n){
        Integer sum=0;
        for(int i=0;i<temp.size();i++){
           sum+=temp.get(i);
           //System.out.print(temp.get(i));
           
        }
         //System.out.println();
        ans.add(sum);
        for(int i=st;i<n;i++){
            temp.add(arr.get(i));
            getSubs(arr,ans,temp,i+1,n);
            temp.remove(arr.get(i));
        }
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        getSubs(arr,ans,temp,0,n);
        return ans;
    }
}