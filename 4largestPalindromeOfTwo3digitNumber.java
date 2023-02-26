class largestPalindromeOfTwo3digitNumbers{
    static boolean palindromechk(int n){
        int temp,rev=0;
        temp=n;
        while(temp>0){
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        if(rev!=n) return false;
        return true;
    }
    public static void main(String[] args) {
        int n,a,b,test=0;
        for(int i=1;i<=9;i++){
            n=9*i+1;
            for(int j=1;j<=n;j++){
                if(n%j==0){
                    a=1001-n/j;
                    b=1001-11*j;
                    test=a*b;
                    if (palindromechk(test)) {
                        System.out.println(test);
                    }
                }
            }
        }
    }
}