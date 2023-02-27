class evenfibonacchi{
    static int fibo(int n){
        if (n<=1) return n;
        else return(fibo(n-1)+fibo(n-2));
    }
    public static void main(String[] args) {
        int sum=0,fib,i=0;
        boolean flag=true;
        while(flag){
            fib=fibo(i);
            System.out.println(fib);
            if((fib%2)==0){
                sum+=fib;
        }
        if(fib>4000000) flag=false;
        i++;
        }
        System.out.println("____________________________");
        System.out.println(sum);
    }
    
}