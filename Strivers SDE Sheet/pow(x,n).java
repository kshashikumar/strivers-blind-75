class Solution {
    public double cal(double x,int n){
         if(n==0){
            return 1;
        }
        double h = cal(x,n/2);
        double hs = h*h;

        if((n&1) == 1){
            return hs * x;
        }
        return hs;
    }
    public double myPow(double x, int n) {
        double ans = cal(x,n);
        //System.out.println("n: "+n);
        if(n>=0){
            return ans;
        }
        return 1/ans;
    }
}