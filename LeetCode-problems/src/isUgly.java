public class isUgly {
    public boolean isUgly(int n) {
        if(n<1) return false;
        while(n%2==0) n=n/2;
        while(n%3==0) n=n/3;
        while(n%5==0) n=n/5;

        // if we still get 1 we will return true otherwise we will return false

        if(n==1) return true;
        else return false;
    }
}
