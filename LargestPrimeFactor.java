//Worked for the example 13195 but not for 600851475143 but ig it works
public class LargestPrimeFactor{
    public static boolean primechk(int n) {
        boolean flag=true;
        for(long i=2;i<n/2;i++){
            if(n%i==0) {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        long num=13195L,largest=0;
        if(num<=1) {
            System.out.println("No prime factors");
        }
        else if(num==2) {
            largest=2;
            System.out.println(largest);
        }
        else{
            for(int i=1;i<=num;i=i+2){
                //System.out.println(i);
                if(num%i==0){
                    if(primechk(i)){
                        largest=i;
                    }
                }
            } 
            System.out.println(largest);
        }
    }
}